package com.student.management;

public class Student {

    // ===== Biến instance (thuộc từng sinh viên) =====
    private String id;
    private String name;

    // ===== Biến static (dùng chung) =====
    private static int studentCount = 0;

    // ===== Hằng số (không thay đổi) =====
    public static final String SCHOOL_NAME = "ABC University";

    // ===== Constructor =====
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++; // mỗi lần tạo sinh viên -> tăng biến đếm
    }

    // ===== Phương thức instance =====
    public void displayInfo() {
        System.out.println("Mã SV: " + id);
        System.out.println("Tên SV: " + name);
        System.out.println("Trường: " + SCHOOL_NAME);
        System.out.println("----------------------");
    }

    // ===== Phương thức static =====
    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên: " + studentCount);
    }
}