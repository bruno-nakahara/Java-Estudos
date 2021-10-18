package cursojava.filesHandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiRead {

		public static void main(String[] args) throws IOException {
			
			FileInputStream entrada = new FileInputStream(new File("C:\\Users\\Bruno\\git\\repository\\primeiro-programa-java\\src\\cursojava\\filesHandle\\file_excel.xls"));
			
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
			HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
			
			Iterator<Row> linhaIterator = planilha.iterator();
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			while(linhaIterator.hasNext()) {
				Row linha = linhaIterator.next();
				
				Iterator<Cell> celulas = linha.iterator();
				
				Pessoa pessoa = new Pessoa();
				
				while (celulas.hasNext()) {
					Cell cell = celulas.next();
					
					switch (cell.getColumnIndex()) {
					case 0:
						pessoa.setName(cell.getStringCellValue());
						break;
						
					case 1:
						pessoa.setEmail(cell.getStringCellValue());
						break;
						
					case 2:
						pessoa.setAge(Double.valueOf(cell.getNumericCellValue()).intValue());
						break;
						
					default:
						break;
					}
				}
				
				pessoas.add(pessoa);
			}
			
			entrada.close();
			
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa);
			}
		}
}
