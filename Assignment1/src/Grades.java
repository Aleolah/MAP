import java.util.ArrayList;

class Grades {
    ArrayList<Grade> grades;

    public Grades() {
        grades = new ArrayList<>();
    }
    public void addGrades(Grade grade) {
        grades.add(grade);
    }

    public void printGrades(){
        for (Grade grade : grades) {
            System.out.println(grade.value);
        }
    }

    public void add(Grade grade) {
        grades.add(grade);
    }
}
