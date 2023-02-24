class cmd5 {
	public static void main(String args []) {
		int p1=Integer.parseInt(args[0]);
		int p2=Integer.parseInt(args[1]);
		int p3=Integer.parseInt(args[2]);
		int x= Math.min(p1, p2); int y= Math.min(p3, x);
		int X=Math.max(p1, p2); int Y=Math.max(p3, X);
		int mid=(p1+p2+p3)-(y+Y);
		System.out.println("Ascending Order: "+y+","+mid+","+Y);
    }   
}