//Write a program to find out given number is vowel or consonant.
//using if.. else
package basicprogram;

public class VowelOrConsonant {
public static void main(String []args)
{
	char ch='1';
	if((ch=='a' || ch=='A')||(ch=='e'||ch=='E') || (ch=='i'||ch=='I') ||
			(ch=='o'||ch=='O') || (ch=='u'||ch=='U'))
	    System.out.println(ch+ " is a Vowel.");
	else if((ch>='0')||(ch<='9'))
		System.out.println(ch+ " is a Number.");
	else
		System.out.println(ch+ " is a Consonant.");
			
}
}
