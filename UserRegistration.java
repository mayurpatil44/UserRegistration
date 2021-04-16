import java.util.regex.*;
import java.util.*;
import java.util.*;

public class UserRegistration 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Last name");
		Scanner sc = new Scanner(System.in);
		String lname = sc.next();
		//Check weather Last Name Valid or not
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,30}$");
		Matcher matcher = pattern.matcher(lname);
		if (matcher.matches())
		{
			System.out.println("Valid Last Name");
		}
		else
		{
			System.out.println("Invalid Last Name");
		}
	}
}
