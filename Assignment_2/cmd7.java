class cmd7 {
	public static void main(String args []) {
		int p1=Integer.parseInt(args[0]);
		int p2=Integer.parseInt(args[1]);
		int p3=Integer.parseInt(args[2]);
		boolean b=(p1<=p2*p3 || p2<=p1*p3 || p3<=p1*p2);
		System.out.println("Output as T/F: "+b);
   }
}