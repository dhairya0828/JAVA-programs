import java.util.*;
class Stack
{
	static int top = -1;
	static int stack[] = new int[20];
	static void push(int num)
	{
		if(top != 20) // default size 20
			stack[++top] = num;
		else
			System.out.println("Stack is full");
	}
	static int pop()
	{
		if(top != -1)
			return stack[top--];
		else
			return -1;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int choice = 0;
		
		while(true)
		{
			System.out.println("\n1 : push\n2 : pop\n3 : print stack\n4 : exit\n");
			System.out.print("Enter your choice : ");
			choice = s.nextInt();
			switch(choice)
			{
				case 1 : int num;
					     System.out.print("Enter number to be pushed in stack : ");
					     num = s.nextInt();
					     push(num);
						 System.out.print("\n" + num + " is pushed to stack\n");
					     break;
				case 2 : int x = pop();
						 if(x != -1)
						 	System.out.print("\n" + x + " is popped from stack\n");
						 else
						 	System.out.println("Stack is empty !!");
						 break;
				case 3 : for(int i=0;i<=top;i++)
							System.out.print(stack[i] + " ");						 
						 break;
				case 4 : System.exit(0);
			}
		}
	}
}