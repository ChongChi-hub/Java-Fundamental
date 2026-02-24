import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhập số sách đang giữ: ");
        int soSach = sc.nextInt();

        if (tuoi >= 18 && soSach < 3) {
            System.out.println("Cho phép mượn sách");
        } else {
            System.out.println("Không đủ điều kiện.");
            if (tuoi < 18) {
                System.out.println("Lý do: Bạn chưa đủ tuổi.");
            } else if (soSach >= 3) {
                System.out.println("Lý do: Bạn đã mượn quá số lượng cho phép.");
            }
        }
    }
}
