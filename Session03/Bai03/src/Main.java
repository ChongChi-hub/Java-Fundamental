public class Main {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        // Tìm giá trị lớn nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("=== SÁCH CÓ SỐ LƯỢNG NHIỀU NHẤT ===");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println(names[i] + " - " + quantities[i] + " cuốn");
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        // Tìm giá trị nhỏ nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("=== SÁCH CÓ SỐ LƯỢNG ÍT NHẤT ===");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println(names[i] + " - " + quantities[i] + " cuốn");
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Doraemon", "Conan", "Harry Potter", "Sherlock Holmes", "Dragon Ball"};
        int[] quantities = {10, 5, 20, 5, 20};

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}
