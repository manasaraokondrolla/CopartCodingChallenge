import java.util.Scanner;

public class Conversion {
	public static void main(String[] args)
	{
		System.out.println("Enter the string you wish to convert:");
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		s.close();
		int num = 0;
	    for (int i = 0; i < str.length(); i++) {
	        num = num * 10 + str.charAt(i) - '0'; //subtraction of '0' ascii value from any number gives the number itself 
	    }
	    System.out.println(num);
	}
}
