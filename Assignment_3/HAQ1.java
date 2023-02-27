import java.util.Scanner;
class HQA1{
    public static void main(String args []) {
        Scanner sc=new scanner(System.in);

        int c= (int)(Math.random()*3);

        System.out.println("Enter Number Between 0-2");
        int a=sc.nextInt();

        System.out.println("System pick: "+c);
        System.out.println("User pick: "+a);

        switch(c) {
            case 2: System.out.println("The Computer picked paper");
            break;
            case 1: System.out.println("The Computer picked rock");
            break;
            case 0: System.out.println("The Computer picked scissor");
            break;
        }

        switch(a){
            case 2: System.out.println("The User picked paper");
            break;
            case 1: System.out.println("The User picked rock");
            break;
            case 0: System.out.println("The User picked scissor");
            break;
        }

        if (c==a)
        System.out.println("It is a Draw.");
        else if(c==1 && a==0)
        System.out.println("You Won.");
        else if(c==0 && a==1)
        System.out.println("You Won.");
        else if(c==1 && a==2)
        System.out.println("You Won.");
        else
        System.out.println("You Lost.");
    }
}