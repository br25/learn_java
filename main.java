import java.util.Scanner;

public class main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where are you? ");
        String location = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("He is now "+location);
        System.out.println("He is "+age+"years old.");
    }
}