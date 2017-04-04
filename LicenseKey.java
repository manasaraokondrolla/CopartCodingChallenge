import java.util.Scanner;

public class LicenseKey {
	public static String formatter(String s, int k)
	{
		String newstr = s.replace("-", "").toUpperCase(); //Removing the '-' and converting to uppercase
		int num = newstr.length(); //get length of modified string
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++)
		{
			sb.append(newstr.charAt(i)); //store characters of modified string into string builder
		}
		
		for(int i=k; i<num;i=i+k)
		{
			sb.insert(num-i,'-'); //insert '-' from end of string as the first group is allowed to be shorter
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the license key:");
		Scanner s = new Scanner(System.in);
		String text = s.nextLine(); //get license
		System.out.println("Enter the desired group length:");
		int k = s.nextInt(); //get group length
		s.close();
		System.out.println(formatter(text,k));
	}
}
