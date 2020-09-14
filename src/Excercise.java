import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number a:");
        double a= input.nextDouble();
        System.out.println("Enter the number b:");
        double b= input.nextDouble();
        System.out.println("Enter the number c:");
        double c= input.nextDouble();
        QuadraticEquation equation= new QuadraticEquation(a,b,c);
        double d= equation.getDiscriminant(a,b,c);
        equation.getRoots(d);
    }
}
