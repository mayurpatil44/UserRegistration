import java.util.*;
import java.util.regex.*;


public class UserRegistration
{
	public static void main(String[] args)
	{
		System.out.println("Enter Email");

		Scanner sc = new Scanner(System.in);
		String email = sc.next();

		Pattern pattern = Pattern.compile("^[a-z]{1,}[.]([a-z]*)[@][a-z]{1,}[.]" + "[a-z]{1,}[.]([a-z]*)");
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches())
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Invalid Email");
		}
	}
}
