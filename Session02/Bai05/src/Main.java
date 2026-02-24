import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diemUyTin = 100; // điểm khởi tạo
        int soNgayTre;

        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        System.out.println("(Nhập số ngày trễ. Nhập 999 để kết thúc)");

        // Vòng lặp while
        while (true) {
            System.out.print("Số ngày trễ của lần này: ");
            soNgayTre = sc.nextInt();

            // Điều kiện thoát vòng lặp
            if (soNgayTre == 999) {
                break;
            }

            // Kiểm tra đúng hạn hay trễ hạn
            if (soNgayTre <= 0) {
                diemUyTin += 5; // cộng điểm
                System.out.println("-> Trả đúng hạn/sớm hạn: +5 điểm.");
            } else {
                int truDiem = soNgayTre * 2;
                diemUyTin -= truDiem; // trừ điểm
                System.out.println("-> Trả trễ " + soNgayTre + " ngày: -" + truDiem + " điểm.");
            }
        }

        System.out.println("Tổng điểm uy tín: " + diemUyTin);

        // Xếp loại
        if (diemUyTin > 120) {
            System.out.println("Xếp loại: Độc giả Thân thiết");
        } else if (diemUyTin >= 80) {
            System.out.println("Xếp loại: Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }
    }
}
