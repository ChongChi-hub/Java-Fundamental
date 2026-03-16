import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();

        System.out.print("Nhap so luong so nguyen cho danh sach: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            listNumber.add(scanner.nextInt());
        }

        System.out.println("Danh sach so nguyen: " + listNumber);

        int min = listNumber.getFirst();

        for (int i = 0; i < listNumber.size(); i++){
            int num = listNumber.get(i);
            if (num < min) min = num;
        }
        System.out.println("So nho nhat trong danh sach: " + min);

        for (int i = 0; i < listNumber.size() - 1; i++){
            for (int j = i + 1; j < listNumber.size(); j++){
                if (listNumber.get(i) < listNumber.get(j)){
                    int temp = listNumber.get(i);
                    listNumber.set(i, listNumber.get(j));
                    listNumber.set(j, temp);
                }
            }
        }
        System.out.print("Danh sach so nguyen giam dan: " + listNumber);
    }
}