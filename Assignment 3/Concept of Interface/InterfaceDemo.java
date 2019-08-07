interface P{
      int pVar=5;
      void displayP();
}

interface P1 extends P{
      int p1Var=15;
      void displayP1();
}
interface P2 extends P{
      int p2Var=25;
      void displayP2();
}
interface P12 extends P1,P2{
      int p12Var=35;
      void displayP12();
}
class Q implements P12{


      void display(){
            System.out.println("Method of Q called, now all other methods will be called !!!");
      }
      public void displayP(){
            System.out.println("Displaying P, pVar = " + pVar);
      }
      public void displayP1(){
            System.out.println("Displaying P1, p1Var = " + p1Var);
      }
      public void displayP2(){
            System.out.println("Displaying P2, p2Var = " + p2Var);
      }
      public void displayP12(){
            System.out.println("Displaying P12, p12Var = " + p12Var);
      }

}
class InterfaceDemo{

      public static void main(String[] args) {

            Q q = new Q();
            q.display();
            q.displayP();
            q.displayP1();
            q.displayP2();
            q.displayP12();
      }
}
