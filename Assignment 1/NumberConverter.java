class NumberConverter{

    static boolean validNumber(int numberType, String number)
    {
        System.out.println(number);
        if(numberType==1)
        {
            for(int i=0;i<number.length();i++)
                if(number.charAt(i)!='0' && number.charAt(i)!='1')
                    return false;
            return true;
        }
        /*else
        {
            for(int i=0;i<number.length();i++)
            {
            //    int temp = number.codePointAt( number.charAt(i) ) ;
                int temp = number.charAt(i);
                if(temp < 48 || temp > 57)
                    return false;
            }
            return true ;
        }*/return true ;
    }
    public static void main(String[] args){
      if(args.length != 2){
          System.out.println("Error !");
          System.out.println("Add NumberType and  Value");
          System.out.println("NumberType ! ");
          System.out.println("1 : Binary to Decimal\n" + "Decimal to Binary");
          System.out.println("For Bunary numbers should be in 0 & 1 only");
          System.exit(0);
      }
      int numberType = Integer.parseInt(args[0]);
      int value = Integer.parseInt(args[1]);
      int convertedValue= 0,temp;
      if(numberType==1)
      {
          int powerCounter=1;
          int[] binaryNum = new int[100];
          if(validNumber(numberType,args[1]))
          {
              while(value != 0){
                  temp = value % 10 ;
                  value /= 10;
                  convertedValue +=  powerCounter*temp;
                  powerCounter *= 2 ;
              }
          System.out.println(convertedValue);
          }
          else
              System.out.println("Not Valid Binary NUmber");
      }
      else
      {

              temp=0; // temp as top of stack
              int[] binaryNum = new int[100];
              while(value != 0)
              {
                  binaryNum[temp] = value % 2 ;
                  value /= 2 ;
                  temp++;
              }
              while(temp != 0)
              System.out.print(binaryNum[--temp]);
      }
    }
}
