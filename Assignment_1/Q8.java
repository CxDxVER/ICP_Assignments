class Q8 {
	public static void main(String args []) {
		int X=500, Y=100;
		System.out.println("Before Swapping Values of X are "+X+ " and Y are "+Y);
		X=X+Y; Y=X-Y; X=X-Y;
		System.out.println("After Swapping Values of X are "+X+ " and Y are "+Y);
	}
}