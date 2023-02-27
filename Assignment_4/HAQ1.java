import java.util.Scanner;
class HQA1 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

        int sum1=0,sum2=0;

        for (int i=1; i<=10; i++) {
            int a=(int)Math.pow(i,2);
            sum1=sum1+a;
            sum2=sum2+a;
        }

        int sq=(int)Math.pow(sum2,2);
        int b=sq-sum1;

        System.out.println("The sum of the squares of the first ten natural numbers is: "+sum1);
        System.out.println("The square of the sum of the first ten natural numbers is:  "+sq);
        System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is: "+b);
	}
}