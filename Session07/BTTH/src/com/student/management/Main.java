package com.student.management;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "An");
        Student s2 = new Student("SV02", "Bình");
        Student s3 = new Student("SV03", "Cường");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.showTotalStudent();
    }
}