import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // giá trị lớn nhất tạm thời
        int min = Integer.MAX_VALUE; // giá trị nhỏ nhất tạm thời
        int tong = 0;                // cộng dồn lượt mượn
        int demNgayMo = 0;           // đếm số ngày có mở cửa

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhập lượt mượn ngày thứ " + i + ": ");
            int luotMuon = sc.nextInt();

            // Nếu ngày đóng cửa (0 lượt mượn) thì bỏ qua
            if (luotMuon == 0) {
                continue;
            }

            // Cập nhật max và min
            if (luotMuon > max) {
                max = luotMuon;
            }
            if (luotMuon < min) {
                min = luotMuon;
            }

            // Cộng dồn để tính trung bình
            tong += luotMuon;
            demNgayMo++;
        }

        System.out.println("\n--- KẾT QUẢ THỐNG KÊ ---");
        System.out.println("Lượt mượn cao nhất: " + max);
        System.out.println("Lượt mượn thấp nhất: " + min);

        if (demNgayMo > 0) {
            double trungBinh = (double) tong / demNgayMo;
            System.out.println("Trung bình lượt mượn/ngày: " + trungBinh);
        } else {
            System.out.println("Không có ngày nào mở cửa để thống kê.");
        }

        sc.close();
    }
}
