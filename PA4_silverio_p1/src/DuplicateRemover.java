import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemover{
	
	String uniqueWords = "";
	
	public void remove(String dataFile) {
		int j;
		FileReader fr;
		try {
			fr = new FileReader(dataFile);
			
			while ((j = fr.read()) != -1)
				uniqueWords += (char) j;
			
			Set<String> wordSet = new LinkedHashSet<String>();
		int start = 0;
		
		for (int i = 0; i < uniqueWords.length(); i++) {
			if (uniqueWords.charAt(i) == ' ') {
				wordSet.add(uniqueWords.substring(start, i));
				start = i + 1;
			}
		}
		wordSet.add(uniqueWords.substring(start, uniqueWords.length()));
		uniqueWords = "";
		wordSet.forEach(word -> {
			uniqueWords += word;
			uniqueWords += " ";
			
		});
		
		fr.close();
		} catch (FileNotFoundException e){
		System.out.println("File Not Found Exception!");
		} catch (IOException e) {
			System.out.println("Input/Output Exception");
		} finally {
			System.out.println("Data Read Successful");
		}
	}

	public void write(String string) {
		// TODO Auto-generated method stub
		
	}

}
