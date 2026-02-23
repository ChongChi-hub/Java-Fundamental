import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookID = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        String bookName = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int publishYear = scanner.nextInt();
        System.out.print("Nhap gia bia: ");
        double price = scanner.nextDouble();
        System.out.print("Sach con trong kho (true/false): ");
        boolean isAvailable = scanner.nextBoolean();

        int old = 2026 - publishYear;

        System.out.println("----- PHIEU THONG TIN SACH -----");
        System.out.println("Ten sach: " + bookName.toUpperCase());
        System.out.println("Ma so: " + bookID + " | Tuoi tho: " + old + " nam");
        System.out.printf("Gia ban: %.2f VNĐ%n", price);
        System.out.println("Tinh trang: " + (isAvailable ? "Con sach" : "Het sach"));
    }
}
