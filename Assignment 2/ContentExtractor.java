class ContentExtractor{

    static String extractContentOfTag(String htmlTag)
    {
        boolean tagEnd ;
        tagEnd=false;
        String content = "";

        for(int i=0 ; i<htmlTag.length()-1; i++)
        {
            if(htmlTag.charAt(i) == '<')
                tagEnd = false ;
            else if(htmlTag.charAt(i) == '>')
            {
                tagEnd = true ;
                content="";
            }
            else if(tagEnd)
            {
                content += htmlTag.charAt(i);
            }
        }
        return content ;
    }

    public static void main(String[] args) {

        String htmlTag = args[0];
        String contentOfTag = extractContentOfTag(htmlTag);
        System.out.println("Content Of Tag : " + contentOfTag);
    }
}
