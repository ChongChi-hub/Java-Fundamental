import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        System.out.println("Nhap so luong diem: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap diem thu " + (i + 1) + ": ");
            scores.add(scanner.nextInt());
        }
        // tim diem nho nhat
        int min = scores.get(0);

        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < min) {
                min = score;
            }
        }
        System.out.println("Diem nho nhat: " + min);

        // sap xep mang giam dan
        for (int i = 0; i < scores.size(); i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(i) < scores.get(j)) {
                    int temp = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, temp);
                }
            }
        }

        System.out.println("Danh sach giam dan: " + scores);

        double sum = 0;
        int passCount = 0;
        int failCount = 0;

        for (int score : scores) {
            sum += score;
            if (score >= 5) passCount++;
            else failCount++;
        }

        System.out.println("Diem trung binh: " + (sum / scores.size()));
        System.out.println("Dat (>=5): " + passCount + " | Khong dat (<5): " + failCount);
    }
}