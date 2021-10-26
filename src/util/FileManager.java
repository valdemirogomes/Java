package util;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class FileManager {
    MessagesView mv = new MessagesView();
    private final String NEW_LINE = "\n";
	public ArrayList<String> readAll(String path) {
		ArrayList<String> lines =  new ArrayList<String>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				lines.add(line);
			}
			br.close();
			fr.close();
                        return lines;
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		return lines;
	}
	public void write(String path, String text) {
		try {
			FileWriter fw = new FileWriter(path, true); //abrindo o arquivo
			fw.write(text + NEW_LINE); // manipulando o arquivo
			fw.close(); // fechando o arquivo
		} catch (IOException e) {
                    mv.MsgBDDLeitura();
		}
	}
}
	
	
	
	
	
	
