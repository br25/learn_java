import java.util.Scanner;

public class main {
    public static void main(String[] args) 
    {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        // root over a+b hole square
        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+z);
        scanner.close();
    }
}