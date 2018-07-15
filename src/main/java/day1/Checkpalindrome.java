package day1;

import java.util.Scanner;

public class Checkpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b="";
		
Scanner s = new Scanner(System.in);
System.out.println("Enter the data:");
String a=s.nextLine();
int n=a.length();

for(int i=n-1;i>=0;i--) 
{
	b=b+a.charAt(i);
	 
	}
if(a.equalsIgnoreCase(b)) {
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not Pallindrome");}
}
}