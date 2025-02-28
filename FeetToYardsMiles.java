import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.6f\n", yards, miles);
    }
}
