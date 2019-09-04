 class ExceptionDemo{
      public static void main(String[] args) {

            try{
                  int n1=Integer.parseInt(args[0]);
                  int n2=Integer.parseInt(args[2]);
                  char operator = args[1].charAt(0);
                  int ans = 0;
                  switch(operator){
                        case '+' : ans = n1+n2;break;
                        case '-' : ans = n1-n2;break;
                        case '*' : ans = n1*n2;break;
                        case '/' : ans = n1/n2;break;
                        default : System.out.println("Invalid operator");
                  }
                  System.out.println(n1 + " " + operator +" "+ n2 + " = "     + ans);
            }
            catch(NumberFormatException nfe){
                  System.out.println("Invalid number !!" );
            }
            catch (ArrayIndexOutOfBoundsException aiobe) {
                  System.out.println("Few Aruguments !!");
                  System.out.println("Try n1 operator n2 !!");
            }
            catch (ArithmeticException e) {
                  System.out.println("Can not divide by 0 !!");
            }
            catch (Exception e) {
                  System.out.println("All type of exception caught !!");
            }
            /*catch (Throwable e) {
                  Throwable t = new Throwable();
                  System.out.println("All type of exception caught !!");
            }*/
      }
}
