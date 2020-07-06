import java.util.Scanner;

public class NumberGuess {
	
	public static void main(String arg[])
	{
		int num = (int) (Math.random() * 100 + 1) ;
		Scanner sc = new Scanner(System.in);
		
		int count=1;
		
		System.out.println("\n\n\t\t\t\t    WELCOME TO THE WOLRD OF NUMBERS!\n");
		
		System.out.println("\t\t\t\t\t\t ________");
		System.out.println("\t\t\t\t\t\t|        |");
		System.out.println("\t\t\t\t\t\t|    ?   |");
		System.out.println("\t\t\t\t\t\t|________|");
		System.out.println("\n\t\t\t      Guess the number in the box between 1 to 100\n");
		
		while(count!=11)
		{
			
			int userinput=sc.nextInt();
			
			if (userinput==num) 
			{
				score(count);
				System.out.println("  Your score is "+ (11-count)+ " out of 10!\n");
				break;
			}
			else {
				answercheck(userinput , num);
			}
			count++;
		}
		if(count==11) {
			System .out.flush();
			System.out.println("\n\n\t\t\t\t You exceeded the limit of attempts . Better luck next time!");
		}
		
	}
	
	public static void score(int x) {
		if (x==1)
			System.out.println("  EXCELLENT!");
		else if(x==2||x==3)
			System.out.println("  PERFECT!");
		else if(x==4||x==5)
			System.out.println("  FABULOUS!");
		else if(x==6||x==7)
			System.out.println("  GREAT!");
		else if(x==8||x==9||x==10)
			System.out.println("  GOOD!");
		
	}
	
	public static void answercheck(int userinput , int num) 
	{
		
		if (userinput<num) {
			System.out.println("  Try something larger.");
		}
		else if (userinput>num) {
			System.out.println("  Try something smaller.");
		}
		else {
			System.out.println("  Oops!! Your input is incorrect try a positive number.");
		}
			
	}

}
