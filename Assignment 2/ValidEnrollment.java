class ValidEnrollment
{
	public static boolean enrollCheck(String enroll)
	{
		String year = enroll.substring(0,2);
		if(!( year.equals("18") ||  year.equals("17") || year.equals("16") ))
		{
			System.out.println("Year not matched");
			return false	;
		}

		String collegeCode = enroll.substring(2,5);
		if( !collegeCode.equals("047"))
		{
			System.out.println("College Code not matched");
			return false;
		}

		String student = enroll.substring(5,7);

		if(!(student.equals("01")  || student.equals("31")  ))
		{
			System.out.println("Admission sem doesn't match");
			return false;
		}

		String branchCode = enroll.substring(7,9);
		if(!branchCode.equals("07"))
		{
			System.out.println("Branch code does not match");
			return false;
		}

		int number = Integer.parseInt(enroll.substring(9,12));
		if(number == 0 || number > 79)
		{
			System.out.println("Invalid student number");
			return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String enrollNo = args[0];
		boolean check;
		check =  enrollCheck(enrollNo);
		if(check)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
