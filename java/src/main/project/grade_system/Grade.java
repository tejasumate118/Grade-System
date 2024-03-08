package main.project.grade_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grade {
    static GradeCalculation gradeSystem = new GradeCalculation();

    public static void main(String[] args) {

        //testSingleGrade();
        //testMultipleGrade();
        testMultipleProperties();
    }

    private static void testMultipleGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter multiple score separated by ,");
        scanner.next();
        String input = scanner.nextLine();
        // 1) Split input into String Array

        String[] inputs = input.split(",");

        // 2) Type Cast string into integer
        List<Integer> scores = new ArrayList<>();
        for(String str : inputs){
            int score = Integer.parseInt(str.trim());
            scores.add(score);
        }

        List<String> grades = gradeSystem.calculateGrade(scores);

        System.out.println(scores);
        System.out.println(grades);

    }

    private static void testSingleGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = scanner.nextInt();
        String grade = gradeSystem.calculateGrade(score);
        System.out.println("Your grade is " + grade);
    }
    private static void testMultipleProperties(){

        Scanner sc=new Scanner(System.in);

        List<Student> students=new ArrayList<>();
        System.out.println("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter student data comma ',' separated.");
            System.out.println("name,rollNo,score");
            String s=sc.nextLine();
            String[] input=s.split(",");
            int rollNo=Integer.parseInt(input[1].trim());
            String name=input[0];
            int score=Integer.parseInt(input[2].trim());
            students.add(new Student(rollNo,name,score));
        }
        gradeSystem.calculateGradeForStudent(students);
        //Print Data
        for (Student student:students){
            student.printData();
        }
    }
}