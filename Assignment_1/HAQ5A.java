// Without using Extra Variable
class HAQ5A {
    public static void main (String args []) {
        int W=1, G=2, K=3, A=4;
        System.out.println("Before Swapping the values of W: "+W+" G: "+G+" K: "+K+" A: "+A)

        W=W+A; A=W-A; W=W-A; G=G+K; K=G-K; G=G-K; K=K+W; W=K-W; K=K-W;

        System.out.println("Before Swapping the values of W: "+W+" G: "+G+" K: "+K+" A: "+A)
    }
}