class SpellChecker{


        static boolean checkForAnagram(String string1, String string2)
        {
            int[] recordOfCharacters = new int[30]; // BY DEFAULT INITIALISED WITH 0
        /*    for(int i=0;i<30;i++)
                System.out.print(recordOfCharacters[i] + " ");*/
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

            String[] availableWords = {"print","hello","dhairya","java","program","spellChecker","suggestion"};
            boolean matched = false ;
            for(int i=0;i<availableWords.length;i++)
            {
                matched = checkForAnagram(args[0], availableWords[i]);
                if(matched)
                {
                    System.out.println("Corrected Word : " + availableWords[i]);
                    break;
                }
            }
            if(!matched)
            {
                System.out.println("Oops ! Your entered word is currently not available in our dictionary");
                System.out.println("We will shortly update with !!");
            }

        }
}
