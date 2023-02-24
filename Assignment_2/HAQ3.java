import java.util.Scanner;
class HAQ3 {
    public static void main (String args []) {
        Scanner sc=new scanner(System.in);
        int eggs, gross, aboveGross, dozens, extras;

        System.out.println("Enter 3 points in a triangle: ");
        double x1= sc.nextDouble(); double x2= sc.nextDouble(); double x3= sc.nextDouble();
        double y1= sc.nextDouble(); double y2= sc.nextDouble(); double y3= sc.nextDouble();

        double a= Math.pow(Math.pow((x2-x1),2)) + Math.pow((y2-y1,2),0.5);
        double b= Math.pow(Math.pow((x3-x2),2)) + Math.pow((y3-y2,2),0.5);
        double c= Math.pow(Math.pow((x1-x3),2)) + Math.pow((y1-y3,2),0.5);

        double s=(a+b+c)/2;

        double a= Math.pow(s*(s-a)*(s-b)*(s-c),0.5);

        System.out.println("The area of the triangle is: "+a);
    }
}