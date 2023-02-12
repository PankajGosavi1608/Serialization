package Transient;

import java.io.Serializable;

public class Dog implements Serializable
{
static transient int i=10;
final transient int j=20;
}

//Transient
//1. transient is the modifier applicable only for variables.
//2. While performing serialization if we don't want to save the value of a particular 
//variable to meet security constant such type of variable , then we should declare 
//that variable with "transient" keyword.
//3. At the time of serialization JVM ignores the original value of transient variable 
//and save default value to the file .
//4. That is transient means "not to serialize"