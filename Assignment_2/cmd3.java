class cmd3 {
	public static void main(String args []) {
	double p1=Integer.parseInt(args[0]);
	double p2=Integer.parseInt(args[1]);
	int c=(int)(p1+(p2-p1)*(Math.random()));
	int d=(int)(p1+(p2-p1)*(Math.random()));
	int e= c+d;
	System.out.println("random number 1: "+c);
	System.out.println("random number 2: "+d);
	System.out.println("Sum: "+e);
   }
}