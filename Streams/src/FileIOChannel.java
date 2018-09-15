
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileIOChannel {

	public static void main(String args[]) {
		FileInputStream fIn;
		FileOutputStream fOut;
		FileChannel fIChan, fOChan;
		long fSize;
		MappedByteBuffer mBuf;

		try {
			fIn = new FileInputStream("D:/demo/vsc.exe");
			fOut = new FileOutputStream("D:/demo/vsx.exe");

			fIChan = fIn.getChannel();
			fOChan = fOut.getChannel();

			fSize = fIChan.size();

			mBuf = fIChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
			long start = System.currentTimeMillis();
			fOChan.write(mBuf); // this copies the file
			long end = System.currentTimeMillis();
			System.out.println("Copy time:" + (end - start) + "m.s.");
			fIChan.close();
			fIn.close();

			fOChan.close();
			fOut.close();
			
	
			
		} catch (IOException exc) {
			System.out.println(exc);
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Usage: Copy from to");
			System.exit(1);
		}
	}
}
