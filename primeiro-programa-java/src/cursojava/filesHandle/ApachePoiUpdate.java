package cursojava.filesHandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiUpdate {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Bruno\\git\\repository\\primeiro-programa-java\\src\\cursojava\\filesHandle\\file_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();//Dados da pessoa na linha
			
			String valorCelula = linha.getCell(0).getStringCellValue();//Pegando o valor da celula
			
			linha.getCell(0).setCellValue(valorCelula + " * Valor gravado na aula");//Atualizando o valor da celula
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
	}
}
