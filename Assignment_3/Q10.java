import java.util.Scanner;
class Q10 {
	public static void main(String args []) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter marks secured: ");
		int m =sc.nextInt();
        switch (m/10) {
            case 10: System.out.println("Grade: O");break;
            case 9: System.out.println("Grade: 0");break;
            case 8: System.out.println("Grade: A");break;
            case 7: System.out.println("Grade: B");break;
            case 6: System.out.println("Grade: C");break;
            case 5: System.out.println("Grade: D");break;
            case 4: System.out.println("Grade: E");break;
            case 3: System.out.println("Grade: F");break;
            default: System.out.println("Grade: F");break;
        }	
    }
}
