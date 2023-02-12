package SerializationWithRespectToInheritanceCase2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWRTInheritance
{

	
	public static void main(String[] args)throws Exception{
		Dog d1=new Dog();
		d1.i=888;
		d1.j=999;
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+"........."+d2.j);
		}
		}


