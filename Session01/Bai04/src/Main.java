import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia sach (USD): ");
        double bookPrice = scanner.nextDouble();

        System.out.print("Nhap ty gia (VNĐ/USD): ");
        float exchangeRate = scanner.nextFloat();

        double totalVND = bookPrice * exchangeRate;

        long roundedVND = (long) totalVND;

        System.out.println("Tong tien (double): " + totalVND + " VNĐ");
        System.out.println("Tong tien (long): " + roundedVND + " VNĐ");
    }
}
