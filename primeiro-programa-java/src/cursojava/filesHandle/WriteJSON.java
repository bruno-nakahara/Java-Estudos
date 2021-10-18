package cursojava.filesHandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class WriteJSON {

	public static void main(String[] args) throws IOException {
		
		User user1 = new User();
		user1.setCpf("45212546695");
		user1.setNome("Bruno");
		user1.setLogin("admin");
		user1.setSenha("admin");
		
		User user2 = new User();
		user2.setCpf("63458964214");
		user2.setNome("Alex");
		user2.setLogin("user");
		user2.setSenha("123");
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(users);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Bruno\\git\\repository\\primeiro-programa-java\\src\\cursojava\\filesHandle\\filejson.json");
		//Caso tiver problemas com acento use:
		//OutputStreamWriter write_in_file = new OutputStreamWriter(new FileOutputStream(new File("path")), "UTF-8");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		/*------------------------------------------------------------------------*/
		
		FileReader fileReader = new FileReader("C:\\Users\\Bruno\\git\\repository\\primeiro-programa-java\\src\\cursojava\\filesHandle\\filejson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<User> listUsers = new ArrayList<User>();
		
		for (JsonElement jsonElement : jsonArray) {
			User user = new Gson().fromJson(jsonElement, User.class);
			listUsers.add(user);
			
		}
		
		System.out.println(listUsers);
	}
}
