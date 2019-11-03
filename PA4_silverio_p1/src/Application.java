
public class Application {

	public static void main( String[] args )
	{
		DuplicateRemover dr = new DuplicateRemover();
		
		System.out.println(System.getProperty("uder.dir"));
		
		dr.remove("problem1.txt");
		
		dr.write("unique_words.txt");
	}
}
