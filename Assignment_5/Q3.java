import java.util.Scanner;
class Q3 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1st number");
        int x=sc.nextInt();
		System.out.println("Enter 2nd  number");
        int y=sc.nextInt();
		
		for(int i=x;i<=y;i++) {
			if(i==1 || i==0) {
				continue;
			}

			int PrimeFlag = 1;

			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					PrimeFlag=0;
					break;}
			}
			if(PrimeFlag==1)
				System.out.println(i);
		}
	}
}