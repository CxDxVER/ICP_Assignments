class Q10 {
	public static void main(String args []) {
		String q1="1", q2="2", q3="3", q4="4";
		String f1= q1, f2=q1+q2+q1, f3=f2+q3+f1, f4=f3+q4+f3;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
	}
}