package Externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Externalizable1 {
	public static void main(String[] args)throws Exception {
		ExternalDemo t1=new ExternalDemo("Pankaj", 10, 20);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t1);
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalDemo t2=(ExternalDemo)ois.readObject();
		System.out.println(t2.s+"-------"+t2.i+"--------"+t2.j);
		}
		}
