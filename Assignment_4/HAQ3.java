import java.util.Scanner;
class HQA3 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);

        for (int i=1000;i<=2000;i++) {
            System.out.println(i+" ");
            if(i%5==4)
                System.out.println("\n");
        }
	}
}