import java.util.*;
import java.util.regex.*;

public class UserRegistration
{
	public static void main(String[] args)
	{
		System.out.println("Enter Mobile Number");

		Scanner sc = new Scanner(System.in);
		String mobile = sc.nextLine();
		//Check weather Mobile nuber valid or not
		Pattern pattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
		Matcher matcher = pattern.matcher(mobile);

		if (matcher.matches())
		{
			System.out.println("Valid Mobile Number");
		}
		else
		{
			System.out.println("Invalid Mobile Number");
		}
	}
}
