import java.util.Scanner;
class HQA5 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        String a=" ";

        for (int i=1;i<=n;i++) {
            a=a+i+a;
            System.out.println(a+" ");
        }
	}
}