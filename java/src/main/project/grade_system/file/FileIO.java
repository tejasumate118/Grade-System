package main.project.grade_system.file;


import main.project.grade_system.*;

import java.io.*;
import java.util.*;
public class FileIO {
    private static final GradeCalculation gradeCalculation=new GradeCalculation();
    public void testCSVInput() {
        System.out.println("Enter the patch of the 'students.cvs' file: ");
        Scanner sc=new Scanner(System.in);
        String path= sc.nextLine();
        List<Student> students=new ArrayList<>();
        try {
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line;
            while ((line=br.readLine())!=null){
                String[] input=line.split(",");
                int rollNo=Integer.parseInt(input[1].trim());
                String name=input[0];
                int score=Integer.parseInt(input[2].trim());
                students.add(new Student(rollNo,name,score));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        gradeCalculation.calculateGradeForStudent(students);
        writeToCSV(path,students);
    }

    private static void writeToCSV(String path, List<Student> students) {
        try {
            FileWriter file= new FileWriter(new File(path));
            String data=formatDataForCSV(students);
            file.write(data);
            file.flush();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static String formatDataForCSV(List<Student> students) {
        StringBuilder sb=new StringBuilder();
        for(Student student:students){
            sb.append(student.getName()+","+student.getRollNo()+","+student.getScore()+","+student.getGrade()+"\n");
        }
        return sb.toString();
    }
}
