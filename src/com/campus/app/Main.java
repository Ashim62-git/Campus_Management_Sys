package com.campus.app;

import com.campus.model.Student;
import com.campus.service.Studentservice;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input from user
        System.out.println("Enter Student ID: ");
        int studentid = sc.nextInt();
        System.out.println("Enter Student Name: ");
        String studentname = sc.next();
        System.out.println("Enter Student Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Student Department: ");
        String department = sc.next();
       System.out.println("Number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the Marks: " +n+" subjects");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sc.nextLine(); // consume the newline character

        }
        Student student = new Student(studentid, studentname, age, department, marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        Studentservice studentService = new Studentservice();
        studentService.displayReportCard(student);
        sc.close();


        }
       
    }
   

