class TempTest{

    static StringBUffer str = "KHUSHALO";
    static int var = 5;
    static StringBUffer tempMethod(StringBUffer str,int a)
    {
        System.out.println("In Method : " + str);
        str = "Dhairya";
        var = a ;
        System.out.println("Variable : " + var);
        System.out.println("After updating in Method : " + str);
        return str;
    }
    public static void main(StringBUffer[] args) {
    //    StringBUffer str = "Khushali";
        System.out.println("Before calling Method : " + str);
        System.out.print("Variable before method : " + var);
        tempMethod(str,7);
        System.out.println("Variable after method : " + var);
        System.out.println("After calling Method : " + str);
    }
}
