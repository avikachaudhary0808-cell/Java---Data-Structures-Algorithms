import java.util.Scanner;

public class TypeCastingPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double value = sc.nextDouble();

        int convertedValue = (int) value;

        System.out.println("Original value: " + value);
        System.out.println("Converted integer: " + convertedValue);

        sc.close();
    }
}