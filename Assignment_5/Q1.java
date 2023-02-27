import java.util.Scanner;
class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
		System.out.println("enter the first number");
        int x=sc.nextInt();
		System.out.println("enter the second number");
        int y=sc.nextInt();

		int FD=0, SD=0;
		for(int i=1;i<=x;i++) {
			 if(x%i==0)
				 FD=FD+i;}
		for (int j=1;j<=y;j++) {
			if (y%j==0)
				SD=SD+j;
		}
    
	if (x==SD && y==FD)
		System.out.println("Amicable numbers");
	else
		System.out.println("not Amicable numbers");			 
	}	
}