//Serialization with respect to inheritance : Case 1: 

//If parent class implements Serializable then automatically every child class by default 
//implements Serializable. That is Serializable nature is inheriting from parent to child.
//Hence even though child class doesn't implements Serializable , we can serialize child 
//class object if parent class implements serializable interface.


package SerializationWithRespectToInheritance;

import java.io.Serializable;

public class Animal implements Serializable
{
int i=10;
}