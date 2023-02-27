import java.util.Scanner;
class Q8 {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
		while(true) {
			int C= 1 + ((int)(Math.random()*(10-1+1)));
			
			System.out.print("Enter a number between 1 to 10: ");
			int U= sc.nextInt();
			if (U<=10)
				if(U>C)
					System.out.println("Too High. Try Again!");
				else if(U<C)
					System.out.println("Too Low. Try Again!");
				else {
					System.out.println("Good Guess!! :)");
					break;}
			else
			    System.out.println("RIP:- Rest in pichewala door");
		}
	}
}