class Q7A {
	public static void main(String args []) {
        int k=0;
        for (int i=1;i<=5;i++) {
            for (int j=65;j<=65+i;j++) {
                char ch=(char)j;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
	}
}