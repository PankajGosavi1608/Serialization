
  //Object Graph In Serialization
//1. Whenever we are serializing an object the set of all objects which are reachable 
//from that object will be serialized automatically. This group of objects is nothing 
//but object graph in serialization.
//2. In object graph every object should be Serializable otherwise we will get runtime 
//exception saying"NotSerializableException".


package ObjectGraphInSerialization;

import java.io.Serializable;

public class Dog implements Serializable
{
Cat c=new Cat();
}