import java.util.Scanner;
class HQA4 {
	public static void main(String args []) {
        int num, sum=0, product=1;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num=sc.nextInt();

        for (int i=1;i<=num;i++) {
            if(i%2==0)
                sum=sum+i;
            else 
                product=product*i;
        }
        System.out.println("Sum of all even numbers: "+sum);
        System.out.println("Product of all odd numbers: "+product);
	}
}