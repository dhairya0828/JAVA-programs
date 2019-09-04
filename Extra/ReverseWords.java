class ReverseWords{
    public static void main(String[] args) {

        String sName = args[0];
        String sNamepart[] = sName.split(" ");
        StringBuffer[] words = new StringBuffer[sNamepart.length];
        StringBuffer answer = new StringBuffer();
        for (int i=0;i<sNamepart.length;i++ ) {
            words[i] = new StringBuffer(sNamepart[i]);
            words[i].reverse();
            words[i].append(" ");
            answer.append(words[i]);
        }
        System.out.println(answer);
    }
}
