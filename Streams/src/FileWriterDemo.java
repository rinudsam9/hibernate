import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		String path = "D:/song.txt";
		FileWriter fw = new FileWriter(path,true); // openign file in char stream
		BufferedWriter writer = new BufferedWriter(fw); // wrapping buffer around stream
		// writing to file
		writer.write("hello world");
		writer.newLine();
		writer.write("strange world");
		writer.newLine();
		writer.write("may the odds be in your favour");
		writer.close();
		fw.close();
	

	}
}
