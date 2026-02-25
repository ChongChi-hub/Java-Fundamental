import java.util.Scanner;

public class Main {

    // Phương thức tìm kiếm tuyến tính
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) { // so sánh không phân biệt hoa thường
                return i; // trả về vị trí nếu tìm thấy
            }
        }
        return -1; // không tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"Doraemon", "Conan", "Harry Potter", "Sherlock Holmes", "Dragon Ball"};

        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int result = searchBooks(books, search);

        // Hiển thị kết quả
        if (result != -1) {
            System.out.println("Tìm thấy sách '" + search + "' tại vị trí số: " + result);
        } else {
            System.out.println("Sách '" + search + "' không tồn tại trong danh sách.");
        }
    }
}
