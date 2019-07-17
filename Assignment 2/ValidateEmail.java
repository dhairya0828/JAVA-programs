
public class ValidateEmail {

	static boolean checkFirstCharacter(String emailAddress)
	{
		char firstCharacter = emailAddress.charAt(0);
		if(	(firstCharacter >= 'a' & firstCharacter <= 'z') |
				(firstCharacter >= '0' & firstCharacter <= '9'))
			return true;
		else
			return false;		
	}
	
	static boolean notAtSymbol(String emailAddress)
	{
		boolean containsAtIndex = emailAddress.contains("@");
		if(!containsAtIndex)
			return true;
		else 
			return false;
	}
	
	static boolean notDotSymbol(String emailAddress)
	{
		int atIndex;
		boolean containsDot = false;
		boolean containsAtIndex = emailAddress.contains("@");
		if(containsAtIndex)
		{
			atIndex = emailAddress.indexOf("@");
			String dotSubstring = emailAddress.substring(atIndex);
			containsDot = dotSubstring.contains(".");
		}
		if(!containsDot)
			return true;
		else 
			return false;
	}
	
	static boolean checkUsernameLength(String emailAddress)
	{
		boolean containsAtIndex = emailAddress.contains("@");
		if(containsAtIndex)
		{
			String[] atSplit = emailAddress.split("@");
			//atSplit[0] should be username: mihir67mj
			int usernameLength = atSplit[0].length();
			if(usernameLength >= 8 & usernameLength <= 20)
				return true;
			else 
			{
				return false;
			}
		}
		else return false;
	}
	
	static boolean mailServiceLength(String emailAddress)
	{
		boolean containsAtIndex = emailAddress.contains("@");
		boolean containsDot = emailAddress.contains(".");
		if(containsAtIndex)
		{
			if(containsDot)
			{
				int atIndex = emailAddress.indexOf("@");
				int dotIndex = emailAddress.indexOf(".", atIndex);
				String domainName = emailAddress.substring(atIndex + 1,dotIndex);
				int domainLength = domainName.length();
				if(domainLength >= 2)
					return true;
				else
				{
					return false;
				}
			}
			else return false;
		}
		else return false;
	}
	
	static boolean invalidSpecialChar(String emailAddress)
	{
		boolean containsAtIndex = emailAddress.contains("@");
		if(containsAtIndex)
		{
			String[] atSplit = emailAddress.split("@");
			boolean invalid = false;
			//at this point we only need to check if username contains _ or .
			//as the only available special characters
			//atSplit[0] = "mihir67mj"
			char[] username = atSplit[0].toCharArray();
			for(int i=0; i<atSplit[0].length(); i++)
			{
				if( !((username[i] >= 'a' & username[i] <= 'z') |
						(username[i] == '_' | username[i] == '.') |
						(username[i] >= '0' & username[i] <= '9')) )
				{
					System.out.println(username[i]);
					invalid = true;
					break;
				}
			}
			return invalid;
		}
		else return true;
		
	}
	
	static boolean invalidDomain(String emailAddress)
	{
		boolean containsAtIndex = emailAddress.contains("@");
		boolean containsDot = emailAddress.contains(".");
		if(containsAtIndex)
		{
			if(containsDot)
			{
				int dotIndex = emailAddress.indexOf(".");
				String domainName = emailAddress.substring(dotIndex);
				int domainLength = domainName.length();
				if(domainLength >= 3)
					return false;
				else 
					return true;
			}
		}	
		return true;
	}
	
	public static void main(String args[])
	{
		//args[0] contains an e-mail address
		//mihir67mj@gmail.com
		String emailAddress = args[0];
		String errorMessage = "";
		if(!checkFirstCharacter(emailAddress))
		{
			errorMessage = errorMessage.concat("Enter a valid first character.\n");
			char firstCharacter = emailAddress.charAt(0);
			if(firstCharacter >= 'A' & firstCharacter <= 'Z')
				errorMessage = errorMessage.concat("The first character can't be in Uppercase.\n");
			else
				errorMessage = errorMessage.concat("The first character can't be a special symbol.\n");
		}
		if(notAtSymbol(emailAddress))
			errorMessage = errorMessage.concat("Enter an e-mail with @\n");
		if(notDotSymbol(emailAddress))
			errorMessage = errorMessage.concat("Enter an e-mail with . after @\n");
		if(!checkUsernameLength(emailAddress))
		{
			errorMessage = errorMessage.concat("Enter a valid username.\n");
			errorMessage = errorMessage.concat("Username length must be between 8-20.\n");
		}
		if(!mailServiceLength(emailAddress))
			errorMessage = errorMessage.concat("MailServiceName must be at least 2 characters long.\n");
		if(invalidSpecialChar(emailAddress))
			errorMessage = errorMessage.concat("Enter a valid username: only a-z, underscore and dot are allowed.\n");
		if(invalidDomain(emailAddress)) 
		{
			errorMessage = errorMessage.concat("Enter a valid domain.\n");
			errorMessage = errorMessage.concat("e.g.: .com or .org\n");
		}
		if(errorMessage.length()==0)
		{
			System.out.println("Congratulations. Your E-mail is valid.");
		}
		else
			System.out.println(errorMessage);	
	}

}
