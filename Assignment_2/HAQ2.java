import java.util.Scanner;
class HAQ2 {
    public static void main (String args []) {
        Scanner sc=new scanner(System.in);
        int eggs, gross, aboveGross, dozens, extras;

        System.out.println("How many Eggs do you have?");
        eggs= sc.nextInt();

        gross= eggs/144;
        aboveGross= eggs%144;

        System.out.println("Your Number of eggs is: "+eggs);
        System.out.println("Gross: "+gross+"Dozens: "+dozens+" & Extras"+extras);

    }
}