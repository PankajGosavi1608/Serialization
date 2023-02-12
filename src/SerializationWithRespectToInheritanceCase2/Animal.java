//Case 2:
//1. Even though parent class does not implementsSerializable we can serialize child 
//object if child class implements Serializable interface.
//2. At the time of serialization JVM ignores the values of instance variables which 
//are coming from non Serializable parent then instead of original value JVM 
//saves default values for those variables to the file.
//3. At the time of Deserialization JVM checks whether any parent class is non 
//Serializable or not. If any parent class is nonSerializable JVM creates a separate 
//object for every non Serializable parent and shares its instance variables to the 
//current object.
//4. To create an object for non-serializable parent JVM always calls no arg 
//constructor(default constructor) of that non Serializable parent hence every non 
//Serializable parent should compulsory contain no arg constructor otherwise we 
//will get runtime exception "InvalidClassException" .
//5. If non-serializable parent is abstract class then just instance control flow will be 
//performed and share it's instance variable to the current object


package SerializationWithRespectToInheritanceCase2;

public class Animal
{
int i=10;
Animal(){
System.out.println("Animal constructor called");
}
}
