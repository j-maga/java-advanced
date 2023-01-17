package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNum {

	public static void main(String[] args)
	{
		String[] valid = {"1-999-585-4009", "999-585-4009", "1-585-4009", "585-4009", "1.999-585-4009", "999 585-4009", "1 585 4009", "111-Java2s"};
		
		Pattern p = Pattern.compile("^(\\d{3}[-.]?){2}\\d{4}$");
		
		for (String num:valid)
		{
			Matcher m = p.matcher(num);
			System.out.println(m.matches());
		}
	}

}
