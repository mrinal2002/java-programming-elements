import java.util.Scanner;

public class UserDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee amount: ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discountAmount, finalFee);
    }
}
