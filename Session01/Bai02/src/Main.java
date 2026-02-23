import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ngay tre: ");
        int n = scanner.nextInt();
        System.out.print("Nhap so luong sach muon: ");
        int m = scanner.nextInt();

        double total = n * m * 5000;

        if(n > 7 && m >= 3){
            total = total * 1.2;
        }

        System.out.println("Tien phat goc: " + (n * m * 5000.0) + " VND" );
        System.out.println("Tien phat sau khi dieu chinh: " + total + " VND");

        boolean lock = total > 50000;
        System.out.println("Yeu cau khoa the: " + lock );
    }
}
