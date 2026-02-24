import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int total = 0;
        int tienPhatMoiNgay = 5000;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn thứ " + i + ": ");
            int soNgayTre = sc.nextInt();

            total += soNgayTre * tienPhatMoiNgay;
        }

        System.out.println("===> Tổng tiền phạt: " + total + " VND");

        sc.close();
    }
}
