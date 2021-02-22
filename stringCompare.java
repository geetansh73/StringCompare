//equals method it compares contents and values for equality
class stringCompare
{
public static void main(String g[])
{
String s1="Sachin";
String s2="Sachin";
String s3=new String("Sachin");
String s4="Saurav";
String s5="sachin";
System.out.println(s1.equals(s2));
boolean d=s1.equals(s3);
System.out.println(d);
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s5));
System.out.println(s1.equalsIgnoreCase(s5));
//string compare by== methods it compares references not values.
System.out.println(s1==s2);
System.out.println(s1==s4);
String str1="Sachin";
String str2="Sachin";
String str3=new String("Sachin");
String str4=new String("Sachin");
System.out.println(str1==str2);//true because both refer to same instance in string literal
System.out.println(str1==str3);//false because it does not works in non pool objects
System.out.println(str3==str4);
//String compare by compareTo() methods
String a1="Sachin";
String a2="Sachin";
String a3="Ratan";
System.out.println(a1.compareTo(a2));//0 if both are same
System.out.println(a1.compareTo(a3));//difference 1 positive
System.out.println(a3.compareTo(a2));//-1
String p1="sachin";
String p2="Sachin";
System.out.println(p2.compareTo(p1));//-1
String w1="seath";
String w2="secth";
int retur=w1.compareTo(w2);
System.out.println(retur);
String q1="sea";
String q2="secd";
int r=q1.compareTo(q2);
System.out.print(r);

}
}
