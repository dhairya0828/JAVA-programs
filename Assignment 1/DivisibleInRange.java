class DivisibleInRange{
    public static void main(String[] args) {
        if(args.length != 3)
        {
            System.out.println("Enter correct number of arguents !!");
            System.out.println("Try i.e. : javac DivisibleInRange 5 10 30");
            System.exit(0);
        }
        int number = Integer.parseInt(args[0]);
        int rangeStartingNo = Integer.parseInt(args[1]);
        int rangeEndingNo = Integer.parseInt(args[2]);

        if(rangeStartingNo > rangeEndingNo)
        {
            int temp = rangeStartingNo ;
            rangeStartingNo = rangeEndingNo ;
            rangeEndingNo = temp ;
        }
        if(rangeStartingNo != rangeEndingNo)
                rangeStartingNo = rangeStartingNo + number - (rangeStartingNo % number) ;
        for(int i=rangeStartingNo;i<=rangeEndingNo;i+=number)
                System.out.print(i + " ");

    }
}
