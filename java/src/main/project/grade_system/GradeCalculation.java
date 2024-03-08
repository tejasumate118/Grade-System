package main.project.grade_system;

import java.util.ArrayList;
import java.util.List;

public class GradeCalculation {

    private static final int[] gradeRange={90,80,70,60};
    private  static  final String[] grades={"A","B","C","D","E"};
    public String calculateGrade(int score){
        //Single Score
        if(score < 0 || score > 100)
            return "Invalid Input! Score must be in range of 1 to 100";
        for(int i=0;i< gradeRange.length;i++){
            if(score >= gradeRange[i])
                return getGrade(i);

        }
        return getGrade(gradeRange.length);
    }

    private String getGrade(int i) {
        return grades[i];
    }

    //Multiple Grade Calculation
   public List<String> calculateGrade(List<Integer> scores){
        List<String> grades=new ArrayList<>();
        for(Integer score: scores){
            grades.add(calculateGrade(score));
        }
        return grades;
    }
    public void calculateGradeForStudent(List<Student> students){
        for(Student student: students){
            student.setGrade(calculateGrade(student.getScore()));
        }
    }

}
