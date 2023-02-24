class cmd4 {
	public static void main(String args []) {
	double p1=Double.parseDouble(args[0]);
	double t=Math.toRadians(p1);
	double c = Math.cos(5*t)+Math.sin(7*t);
	System.out.println("Radians: "+t);
	System.out.println("Answer: "+c);
   }
}
