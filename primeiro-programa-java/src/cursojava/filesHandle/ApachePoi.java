package cursojava.filesHandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

		public static void main(String[] args) throws IOException {
			
			File file = new File("C:\\Users\\Bruno\\git\\repository\\primeiro-programa-java\\src\\cursojava\\filesHandle\\file_excel.xls");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			Pessoa pessoa1 = new Pessoa();
			pessoa1.setAge(25);
			pessoa1.setName("Bruno");
			pessoa1.setEmail("japa@gmail.com");
			
			Pessoa pessoa2 = new Pessoa();
			pessoa2.setAge(41);
			pessoa2.setName("Alex");
			pessoa2.setEmail("alex@gmail.com");
			
			Pessoa pessoa3 = new Pessoa();
			pessoa3.setAge(21);
			pessoa3.setName("Diego");
			pessoa3.setEmail("diego@gmail.com");
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			
			HSSFWorkbook hssfworkbook = new HSSFWorkbook();
			HSSFSheet linhasPessoa = hssfworkbook.createSheet("Planilha de pessoas");//Criando planilha
			
			int numeroLinha = 0;
			
			for (Pessoa p : pessoas) {
				Row linha = linhasPessoa.createRow(numeroLinha++);//criando linha na planilha
				
				int celula = 0;
				
				Cell celNome = linha.createCell(celula++);
				celNome.setCellValue(p.getName());
				
				Cell celEmail = linha.createCell(celula++);
				celEmail.setCellValue(p.getEmail());
				
				Cell celAge = linha.createCell(celula++);
				celAge.setCellValue(p.getAge());
			}
			
			FileOutputStream saida = new FileOutputStream(file);
			hssfworkbook.write(saida);
			saida.flush();
			saida.close();
			
			System.out.println("Planilha criada");
			
		}
}
