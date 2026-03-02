public class Student {
    private int id;
    private String name;
    private int year;
    private double avg;

    public Student(int id, String name, int year, double avg) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.avg = avg;
    }

    public void displayStudent(){
        System.out.println("Thong tin sinh vien: ");
        System.out.println("Ma sinh vien: " + id);
        System.out.println("Ho va ten: " + name);
        System.out.println("Nam sinh: " + year);
        System.out.println("Diem trung binh: " + avg);
    }
}
