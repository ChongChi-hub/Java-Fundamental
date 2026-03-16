import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_12 {
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

        int count = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            int curr = listNumber.get(i);
            if (curr < 0){
                count++;
            }
        }

        System.out.println("So luong so nguyen am: " + count);
    }
}