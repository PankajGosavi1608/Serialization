package CustomizedSerializeWithDataLoss;

import java.io.Serializable;

public class Account implements Serializable
{
String userName="Pankaj";
transient String pwd="Vaishali";
}