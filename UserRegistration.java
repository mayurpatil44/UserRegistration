import java.util.*;
import java.util.regex.*;

public class UserRegistration
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Password");

		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();

		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}");
		Matcher matcher = pattern.matcher(pwd);

		if (matcher.matches())
		{
			System.out.println("Valid According to Rule 1 & 2");
			System.out.println("1 : Must have 8 characters"
					+ "\n2 : Must have atleast one UpperCase"
					+ "\n3 : Must have atleast one Numeric");
		}
		else
		{
			System.out.println("Invalid According to Rule 1 & 2");
			System.out.println("1 : Must have 8 characters"
					+ "\n2 : Must have atleast one UpperCase"
					+ "\n3 : Must have atleast one Numeric");
		}
	}
}
