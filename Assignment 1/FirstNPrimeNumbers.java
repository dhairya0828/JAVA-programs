class FirstNPrimeNumbers{
    public static void main(String[] args) {
        if(args.length !=1)
        {
            System.out.println("Very Few or more arguments than expected !!");
            System.out.println("Try i.e. javac PrimeNumbers 5");
            System.exit(0);
        }
        int totalNum = Integer.parseInt(args[0]);
        totalNum--;
        System.out.print("2 ");
        for(int i=3;totalNum!=0;i++)
        {
            boolean prime = true ;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i % j == 0)
                {
                    prime = false ;
                    break ;
                }
            }
            if(prime)
            {
                System.out.print(i + " ");
                totalNum--;
            }
        }

    }

}
