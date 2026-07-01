package demoexception;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class DemoThrows {
	    // The 'throws' keyword warns that this method might fail with a FileNotFoundException
	    public static void openFile() throws FileNotFoundException {
	        // This line will look for a file that doesn't exist
	        FileReader file = new FileReader("non_existent_file.txt");
	    }

	    public static void main(String[] args) {
	        try {
	            // Because openFile() declares 'throws', we MUST wrap it in a try-catch block
	            openFile();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error handled in main: File could not be found!");
	        }
	    }
	}

