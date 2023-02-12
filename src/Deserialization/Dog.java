package Deserialization;

import java.io.Serializable;

class Dog implements Serializable
{
   int i=10;
   int j=20;
}


//DeSerialization.
//1. The process of reading state of an object from a file is called DeSerialization
//2. but strictly speaking it is the process of converting an object from file supported 
//form (or) network supported form to java supported form.
//3. By using FileInputStream and ObjectInputStream classes we can achieve 
//DeSerialization.

//Serialization
//	
//1. The process of saving (or) writing state of an object to a file is called serialization 
//2. but strictly speaking it is the process of converting an object from java supported 
//form to either network supported form (or) file supported form.
//3. By using FileOutputStream and ObjectOutputStream classes we can achieve 
//serialization process.
//4. Ex: big ballon