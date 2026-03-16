import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu "+ (i+1) + ": ");
            listNumber.add(scanner.nextInt());
        }

        System.out.println("Danh sach: " + listNumber);

        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) % 5 == 0){
                num.add(listNumber.get(i));
            }
        }

        System.out.println("Cac so chia het cho 5: " + num);
    }
}