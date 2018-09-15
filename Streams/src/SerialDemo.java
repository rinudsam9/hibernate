import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
public static void main(String[] args) throws Exception{
	Person p=new Person("polo",21);
	System.out.println(p);
	
	//Serializing person object
	FileOutputStream fos=new FileOutputStream("D:/demo/pers.dat");
	ObjectOutputStream ostream=new ObjectOutputStream(fos);
	ostream.writeObject(p); //object serialized
	ostream.close();
	fos.close();
	
	//deserializing person object
	ObjectInputStream istream=new ObjectInputStream(new FileInputStream("D:/demo/pers.dat"));
	Object po=istream.readObject();
	System.out.println(po);
	istream.close();
	
}
}
