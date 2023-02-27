import java.util.Scanner;
class Q4 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
        
		int c=1+(int) (Math.random()*9);
		System.out.println("Enter a Number between 1 and 9: ");
        int a=sc.nextInt();

		System.out.println("Computer Guesses: "+c+" ");
		if (c==a)
			System.out.println("You Got it Right");
		else if(c==a+1 || c==a-1)
			System.out.println("Almost Got it");
		else
			System.out.println("The Number is Out Of Universe");
	}
}