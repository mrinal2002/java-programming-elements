public class DiscountCalculator {
    public static void main(String[] args) {
        double fee = 125000, discountPercent = 10;
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discountAmount, finalFee);
    }
}
