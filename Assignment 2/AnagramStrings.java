    class AnagramStrings{


    static boolean checkForAnagram(String string1, String string2)
    {
        int[] recordOfCharacters = new int[30]; // BY DEFAULT INITIALISED WITH 0
       /* for(int i=0;i<30;i++)
            System.out.print(recordOfCharacters[i] + " ");
*/
        if(string1.length() !=string2.length() )
            return false ;
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        for(int i=0;i<string1.length();i++)
            recordOfCharacters[string1.charAt(i) - 'a']++;

        for(int i=0;i<string1.length();i++)
            recordOfCharacters[string2.charAt(i) - 'a']--;

        for(int i=0;i<recordOfCharacters.length;i++)
            if(recordOfCharacters[i]!=0)
                return false;
        return true ;
    }


    public static void main(String[] args) {
       
        boolean anagram =  checkForAnagram(args[0], args[1]);
        if(anagram)
            System.out.println("Strings Are Anagram !!");
        else
            System.out.println("Strings are not Anagram !!");

    }
}
