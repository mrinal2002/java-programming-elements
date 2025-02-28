import java.util.Scanner;

public class TriangleArea {
    public static void calculateAndDisplayArea(double base, double height) {
        double areaCm = 0.5 * base * height;
        double conversionFactor = 2.54 * 2.54;
        double areaIn = areaCm / conversionFactor;
        
        System.out.printf("The Area of the triangle in sq cm is %.2f and in sq in is %.2f\n", areaCm, areaIn);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();
        
        calculateAndDisplayArea(base, height);
    }
    
}
