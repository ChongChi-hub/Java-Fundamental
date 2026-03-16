import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop Dell XPS", 250000, 24));
        repo.add(new ElectronicProduct("E02", "Chuột Logitech", 500000, 12));
        repo.add(new FoodProduct("F01", "Bánh trung thu", 150000, 10));
        repo.add(new FoodProduct("F02", "Kẹo dẻo", 30000, 5));

        System.out.println("=== 1. TOÀN BỘ DANH SÁCH SẢN PHẨM ===");
        List<Product> allProducts = repo.findAll();
        if (allProducts != null) {
            for (Product p : allProducts) {
                p.displayInfo();
                System.out.println("=> Thành tiền: " + p.calculateFinalPrice() + "VND");
                System.out.println("--------------------");
            }
        }

        System.out.println("\n=== 2. TÌM SẢN PHẨM THEO ID ===");
        String searchId = "E01";
        Product found = repo.findById(searchId);
        if (found != null) {
            System.out.println("Đã tìm thấy:");
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy sản phẩm mã: " + searchId);
        }

        System.out.println("\n=== 3. SẮP XẾP DANH SÁCH THEO GIÁ TĂNG DẦN ===");
        Collections.sort(allProducts, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        for (Product p : allProducts) {
            System.out.println(p.getId() + " - " + p.getName() + " - Giá gốc: " + p.getPrice());
        }

        System.out.println("\n=== 4. THỐNG KÊ SỐ LƯỢNG SẢN PHẨM ===");
        Map<String, Integer> stats = countProductByType(repo.findAll());
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            System.out.println("Loại " + entry.getKey() + ": " + entry.getValue() + " sản phẩm");
        }
    }

    public static Map<String, Integer> countProductByType(List<Product> products) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Electronic", 0);
        map.put("Food", 0);

        if (products != null) {
            for (Product p : products) {
                if (p instanceof ElectronicProduct) {
                    map.put("Electronic", map.get("Electronic") + 1);
                } else if (p instanceof FoodProduct) {
                    map.put("Food", map.get("Food") + 1);
                }
            }
        }
        return map;
    }
}