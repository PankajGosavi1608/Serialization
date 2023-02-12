package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalDemo implements Externalizable {
	String s ;
	int i ;
	int j ;
	public ExternalDemo() { 
	System.out.println("public no-arg constructor");
	}
	public ExternalDemo(String s , int i, int j) {
	this.s=s ;
	this.i=i ;
	this.j=j ;
	}
	public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(s);
	out.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws IOException , 
	ClassNotFoundException {
	s=(String)in.readObject();
	i= in.readInt();
	}

	}


//Externalization : ( 1.1 v )
//1. In default serialization every thing takes care by JVM and programmer doesn't 
//have any control.
//2. In serialization total object will be saved always and it is not possible to save part 
//of the object , which creates performence problems at certain point.
//3. To overcome these problems we should go for externalization where every thing 
//takes care by programmer and JVM doesn't have any control.
//4. The main advantage of externalization over serialization is we can save either 
//total object or part of the object based on our requirement.
//5. To provide Externalizable ability for any object compulsory the corresponding 
//class should implements externalizable interface.
//6. Externalizable interface is child interface of serializable interface.