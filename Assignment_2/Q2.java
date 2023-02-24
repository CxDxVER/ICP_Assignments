class Q2 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance in Kilometer:");
		double d=sc.nextDouble();
		double m=0,cm=0,feet=0,in=0;
		m=d*1000; feet=d*3280.84; in=d*39370.1; cm=d*100000;
		System.out.println("distance in Meter: "+m+" m");
		System.out.println("distance in feet: "+feet+" feet");
		System.out.println("distance in inches: "+in+" in");
		System.out.println("distance in centimeters: "+cm+" cm");
	}
}