import java.util.Scanner;
class Q2 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int x=sc.nextInt();
        
		int n=x,rev,s=0;
		while(n!=0) {
			rev=n%10;
			s=s*10+rev;
			n=n/10;
		}

		int TwistedFlag = 0;
		
		for(int i=2;i<=s/2;i++) {
			if(s%i==0) {
				TwistedFlag=1;
				break;}
		}
		
		if(TwistedFlag==0)
			System.out.println(x+" is a twisted prime");
		else
			System.out.println(x+" is not a twisted prime");
	}
}