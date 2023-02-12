package Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable
	{
	public static void main(String args[]) throws Exception{
		
	Dog d1=new Dog();
	System.out.println("Serialization started");

	FileOutputStream fos=new FileOutputStream("abc.ser");

	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d1);
	System.out.println("Serialization ended");
	System.out.println("Deserialization started");

	FileInputStream fis=new FileInputStream("abc.ser");

	ObjectInputStream ois=new ObjectInputStream(fis);
	Dog d2=(Dog)ois.readObject();
	System.out.println("Deserialization ended");
	System.out.println(d2.i+"................"+d2.j);
	}
	}


