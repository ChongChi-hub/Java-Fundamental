import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_13 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listString = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            System.out.print("Nhap chuoi thu " + (i+1) + ": ");
            listString.add(scanner.nextLine());
        }

        System.out.println("Danh sach cac chuoi: " + listString);

        String longestString = listString.getFirst();

        for (int i = 0; i < listString.size(); i++){
            String curr = listString.get(i);
            if (curr.length() > longestString.length()){
                longestString = curr;
            }
        }

        System.out.println("Chuoi co ky tu dai nhat: " + longestString);
    }
}