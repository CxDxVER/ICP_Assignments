import java.util.Scanner;
class Q10 {
	public static void main(String args []) {
		int a=0,b=1,c=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of series:");
		int len=sc.nextInt();
        System.out.println(a+" "+b+" "+c+" ");
		for(i=4;i<=len;i++) {
            int sum=a+b+c;
            System.out.print(sum+" ");
		    a=b;
		    b=c;
            c=sum;
		}
	}
}
