import java.util.Scanner;
class HAQ1 {
	public static void main(String args []) {
		Scanner sc=new Scanner (System.in);
        
		int mins,years,months,days=0;

		System.out.println("Enter number of minutes: ");
		mins=sc.nextInt();

		years=mins/525600;
		days=mins/1440;
		int rem=days%525600;

		System.out.println(mins+" is approximately "+years+" years "+days+" days "+rem+" remaining minutes.");
	}
}