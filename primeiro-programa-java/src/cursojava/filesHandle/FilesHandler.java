package cursojava.filesHandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesHandler {

	public static void main(String[] args) throws IOException {
		
//		File file = new File("C:\\Users\\Bruno\\git\\repository\\primeiro-programa-java\\src\\cursojava\\filesHandle\\file.csv");
//		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		
//		FileWriter writer = new FileWriter(file);
//		
//		writer.write("Hello World");
//		writer.write("\n");
//		writer.write("Trabalhando com pacotes IO");
//		writer.flush();
//		writer.close();
		
		FileInputStream fileInput = new FileInputStream(
				new File("C:\\Users\\Bruno\\git\\repository\\primeiro-programa-java\\src\\cursojava\\filesHandle\\file2Read.txt"));
				//Serve tambem para arquivos ".csv"
		
		Scanner readFile = new Scanner(fileInput, "UTF-8");
		
		while (readFile.hasNext()) {
			
			String line = readFile.nextLine();
			
			if (line != null && line.isEmpty()) {
				System.out.println(line);
			}
		}
	}
}
