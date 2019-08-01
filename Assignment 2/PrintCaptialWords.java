class PrintCaptialWords{

    public static void main(String[] args) {

        System.out.println(args[0]);
        String[] words = args[0].split(" ");
        for(int i=0;i<words.length;i++)
        {
            boolean capital = true; ;
            for(int j=0;j<words[i].length();j++)
            {
                if(!Character.isUpperCase(words[i].charAt(j)))
                {
                    capital = false;
                    break;
                }
            }
            if(capital)
                System.out.println(words[i]);
        }
    }
}
