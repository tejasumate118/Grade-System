package main.project.grade_system;

class Student {
    int rollNo;
    String name;
    int score;
    String grade;
    Student(int RollNo,String Name, int Score){
        this.name =Name;
        this.rollNo =RollNo;
        this.score =Score;
    }

    public void setGrade(String Grade) {
        this.grade =Grade;
    }

    public int getScore() {
        return score;
    }
    public void printData(){
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("rollNo: "+ rollNo);
        System.out.println("name: "+ name);
        System.out.println("Score: "+ score);
        System.out.println("Grade: "+ grade);
        System.out.println("-----------------------------------------------------------------");



    }
}
