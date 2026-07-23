import java.util.Scanner;
public class ScannerInput {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();
         sc.nextLine(); 

        System.out.println("tell about yourself");
        String about = sc.nextLine();

        System.out.println("are you placed");
        boolean isPlaced = sc.nextBoolean();

        System.out.println("enter your cgpa");
        double cgpa = sc.nextDouble();

        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("About:" +about);
        System.out.println("Placed:" +isPlaced);
        System.out.println("CGPA:" +cgpa);
        sc.close();
    }

}