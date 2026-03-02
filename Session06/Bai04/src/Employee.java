public class Employee {
    private int id;
    private String name;
    private double slr;

    // Khong co tham so
    public Employee() {
        id = 1;
        name = "E1";
        slr = 1;
    }

    // Co tham so ma va ten
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.slr = 2;
    }

    // Co tham so day du \
    public Employee(int id, String name, double slr) {
        this.id = id;
        this.name = name;
        this.slr = slr;
    }

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + slr);
        System.out.println("-------------------");
    }
}
