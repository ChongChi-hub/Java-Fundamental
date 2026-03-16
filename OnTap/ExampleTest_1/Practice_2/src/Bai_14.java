import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_14 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            listNumber.add(scanner.nextInt());
        }

        System.out.println("Danh sach so nguyen: " + listNumber);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum+=listNumber.get(i);
        }
        for (int i = 0; i < listNumber.size(); i++){
            if (listNumber.get(i) > (sum / listNumber.size())){
                count++;
            }
        }

        System.out.println("Trung binh: " + (sum / listNumber.size()));
        System.out.println("So luong so lon hon trung binh: " + count);
    }
}