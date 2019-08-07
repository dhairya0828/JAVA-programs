class CurrencyConverter{

      public static void main(String[] args){
          if(args.length != 2){
              System.out.println("Error !");
              System.out.println("Add CurrencyType and CurrencyValue");
              System.out.println("CurrencyType : ");
              System.out.println("1 : USD to INR\n" + "2 : INR to USD");
              System.exit(0);
          }
          
          int CurrencyType = Integer.parseInt(args[0]);
          int CurrencyValue = Integer.parseInt(args[1]);
          int rate = 70 ;

          if(CurrencyType==1)
                System.out.println("$"+CurrencyValue + " = " + (CurrencyValue * rate) + " INR" );
          else
                System.out.println(CurrencyValue + " INR = $" + (CurrencyValue / rate));
      }
}
