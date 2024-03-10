package main.project.grade_system;

class Student {
    private int rollNo;
    private String name;
    private int score;
    private String grade;
    Student(int RollNo,String Name, int Score){
        this.name =Name;
        this.rollNo =RollNo;
        this.score =Score;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }




    public void setGrade(String Grade) {
        this.grade =Grade;
    }

    public int getScore() {
        return score;
    }
    public void printData(){
        //Formatting
        System.out.println("+--------+--------------------+-------+-------+");
        System.out.printf("| %-6s | %-18s | %-5s | %-5s |\n",getRollNo(),getName(),getScore(),getGrade());
        /*
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("rollNo: "+ rollNo);
        System.out.println("name: "+ name);
        System.out.println("Score: "+ score);
        System.out.println("Grade: "+ grade);
        System.out.println("-----------------------------------------------------------------");
        */


    }
}
