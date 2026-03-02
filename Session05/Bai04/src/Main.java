public class Main {
    static void main(String[] args) {
        Employee e1 = new Employee();

        Employee e2 = new Employee(2, "Nguyen Van A");

        Employee e3 = new Employee(3, "Tran Thi B", 33333);

        // Hiển thị thông tin
        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
    }
}