public class Student {
    int id;
    String name;
    static int totalStudent = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void displayStudent() {
        System.out.println("----------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void displayTotalStudent() {
        System.out.println("Tong so sinh vien: " + totalStudent);
    }
}
