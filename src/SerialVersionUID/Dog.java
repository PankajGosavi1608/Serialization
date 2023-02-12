package SerialVersionUID;

import java.io.Serializable;

public class Dog implements Serializable {
	private static final long serialVersionUID=1L;
	int i=10;
	int j=20;
	}







//we can configure serialVersionUID as Above : 
//To perform Serialization & Deserialization internally JVM will use a unique identifier , 
//which is nothing but serialVersionUID .
//At the time of serialization JVM will save serialVersionUID with object.
//At the time of Deserialization JVM will compare serialVersionUID and if it is matched 
//then only object will be Deserialized otherwise we will get RuntimeException saying 
//"InvalidClassException".
