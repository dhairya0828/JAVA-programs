class ValidEmail{
    static String checkFirstChar(String emailAddress, String notValidMessage)
    {
        char firstCharacter = emailAddress.charAt(0);
        if(	(firstCharacter >= 'a' & firstCharacter <= 'z') || (firstCharacter >= '0' & firstCharacter <= '9'))
            return "" ;
        else
        {
            if(firstCharacter >='A' && firstCharacter <='Z')
                notValidMessage = notValidMessage.concat("Capital letter is not allowed as first character !!\n");
            else
                notValidMessage = notValidMessage.concat("Special symbol is not allowed as first character !!\n");

            return notValidMessage ;
        }
    }

    static String checOtherParameters(String emailAddress,String notValidMessage)
    {
        String[] email = emailAddress.split("@");

        if(email.length != 2)
            notValidMessage = notValidMessage.concat("No @ symbol or No Domain/username or More than one @ !! \n");

        int nameLength = email[0].length();
        int domainLength = email[1].length();

        if(nameLength < 8 || nameLength > 20)
            notValidMessage = notValidMessage.concat("Length of username must be more than 8 characters and less than 20 characters \n");

        int indexOfDot = email[1].indexOf('.');

        if(indexOfDot == -1)
            notValidMessage = notValidMessage.concat("Email must Contain '.' \n" );

        int index = emailAddress.indexOf(email[1]);

        if((index - indexOfDot) < 4 )
            notValidMessage = notValidMessage.concat("To Few letters of domain name !!\n");

        return notValidMessage ;

    }


    public static void main(String[] args) {

        String emailAddress = args[0];
        String notValidMessage = "";

        notValidMessage = checkFirstChar(emailAddress,notValidMessage);
        notValidMessage = checOtherParameters(emailAddress,notValidMessage);

        if(notValidMessage.length() == 0)
            System.out.println("Your email is Valid !!\n");
        else
            System.out.println("Sorry Your email is not Valid !!\n" + notValidMessage);

    }
}
