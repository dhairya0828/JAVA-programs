class TempTest{

    static String str = "KHUSHALO";
    static String tempMethod(String str)
    {
        System.out.println("In Method : " + str);
        str = "Dhairya";
        System.out.println("After updating in Method : " + str);
        return str;
    }
    public static void main(String[] args) {
    //    String str = "Khushali";
        System.out.println("Before calling Method : " + str);
        tempMethod(str);
        System.out.println("After calling Method : " + str);
    }
}
