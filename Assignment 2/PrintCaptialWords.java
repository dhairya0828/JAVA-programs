class PrintCaptialWords{

    public static void main(String[] args) {

        String[] words = args[0].split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(CharMatcher.javaUpperCase().matchesAllOf(words[i]))
                System.out.println(words[i]);
        }
    }
}
