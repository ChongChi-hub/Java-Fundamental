public class Main {
    static void main(String[] args) {
        // Dữ liệu hợp lệ
        User u1 = new User("U01", "admin", "123456", "admin@gmail.com");

        // Email sai
        User u2 = new User("U02", "user2", "abc123", "gmail.com");

        // Password rỗng
        User u3 = new User("U03", "user3", "", "user3@gmail.com");

        u1.display();
        u2.display();
        u3.display();
    }
}