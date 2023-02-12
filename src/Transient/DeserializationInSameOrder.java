package Transient;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationInSameOrder {
	
	public static void main(String[] args) throws Exception {
		
	
	
	Dog d1=new Dog( );
	Cat c1=new Cat( );
	
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d1);
	oos.writeObject(c1);

	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Dog d2=(Dog)ois.readObject();
	Cat c2=(Cat)ois.readObject();
	
	FileInputStream fis1=new FileInputStream("abc.ser");
	ObjectInputStream ois1=new ObjectInputStream(fis1);
	Object o=ois1.readObject( );
	if(o instanceof Dog) {
	 Dog d3=(Dog)o;
	System.out.println("Dog barks");
	}
	else if(o instanceof Cat) {
	 Cat c3=(Cat)o;
	 System.out.println("Cat Meoning");
	}

	

	}
}
//(We can serialize any no of objects to the file but in which order we serialized in the 
//same order only we have to deserialize.)