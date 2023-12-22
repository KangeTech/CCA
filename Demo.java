import java.io.*;
import java.util.*; 

public class Demo {
	int data=50;//instance variable 
	static int m=100;//static variable 
	int method()
	{ int n=90;
	return n + m;}//local variable 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
		//int a= sc.nextInt(); 
		//String s=sc.next();
		//char a = sc.next().charAt(0);
		//String first = "Java";
		//String joinedString = first.concat(second);
		//int length = greet.length();
		//char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		//String s=new String(ch); 
		//boolean result = str1.contains("Java");
		//System.out.println(str1.substring(0, 4));
		//String joinedStr = String.join(" ", str1, str2, str3);
		//System.out.println(str1.replace('b', 'c'));
		//String str3 = String.valueOf(c);
		//String str1 = Integer.toString(a);
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		//int c= sc.nextInt();  
		//int d=a+b+c;  
		//System.out.println("Total= " +d);  
		System.out.print("jjjjjjjjjjjj     "+args[0]);

}
}
