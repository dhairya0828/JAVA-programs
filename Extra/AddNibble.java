// if there is 0 at starting of nibble then nibble 1111 should be added very next to this nibble
// input can  be "1110 0111 0101" then your answer should "1110 0111 1111 0101 1111"
class AddNibble{
      public static void main(String[] args) {

            String number = args[0];
            String finalNum = "";
            boolean addNibble = false ; // keeps info of adding nibble

            for(int i=0;i<number.length();i++)
            {
                  String temp = number.substring(i,i+1);
                  finalNum = finalNum.concat(temp);

                  if(i%5 == 3 && addNibble) // to add nibble
                        finalNum = finalNum.concat(" 1111");
                  else if(i%5 == 0){ // checks whether first is 0 or not
                        if(number.charAt(i)=='0')
                              addNibble = true ;
                        else
                              addNibble = false ;
                  }
            }
            System.out.println(finalNum);
      }
}
