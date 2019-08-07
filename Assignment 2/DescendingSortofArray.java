class DescendingSortofArray{

      public static void main(String args[])    {
      int[] arr = new int[args.length+1];
         for(int i=0;i < args.length;i++)
              arr[i]=Integer.parseInt(args[i]);
          for(int i=args.length-1;i>0;i--) {
              for(int j=0;j<i;j++) {
                  if(arr[j] < arr[j+1]) {
                      int temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                  }
              }
          }
          for(int i=0;i<args.length;i++)
              System.out.print(arr[i] + " ");
      }
}
