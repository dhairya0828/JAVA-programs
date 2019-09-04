class ABC{
      static void display(){
            System.out.println("Hello");
      }
}
class BCD extends ABC{
      static void display(){
            System.out.println("Dhairya");
      }
}

class GEF{
      public static void main(String[] args) {
            System.out.println("MAIN");
            BCD.display();
            ABC.display();
      }
}
