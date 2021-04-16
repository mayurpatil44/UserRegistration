import java.util.regex.*;
import java.util.*;

public class UserRegistration
{
	public static void main(String[] args)
	{
		System.out.println("Enter First name");

		Scanner sc = new Scanner(System.in);
		String fname = sc.next();
		//Check  weather  first valid or Not
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,30}$");
		Matcher matcher = pattern.matcher(fname);

		if (matcher.matches())
		{
			System.out.println("Valid First Name");
		}
		else
		{
			System.out.println("Invalid First Name");
		}
	}
}
