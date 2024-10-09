import java.util.ArrayList;

public class Aufgabe1 {
    public Grades insufficient_grades(Grades grades){
        Grades insufGrades = new Grades();
        for(Grade grade : grades.grades)
        {
            if ( grade.value < 40)
                insufGrades.add(grade);
        }
        return insufGrades;
    }
    public int average (Grades grades){
        int average = 0;
        for(Grade grade : grades.grades){
            average += grade.value;
        }
        average /= grades.grades.size();
        return average;
    }
    public Grades roundedGrades(Grades grades){
        Grades roundedGrades = new Grades();
        for (Grade grade : grades.grades) {
            if (grade.value >= 38 ){
                if ( grade.value%10 == 3 || grade.value%10 == 4)
                    grade.value = (grade.value/10%10) *10 + 5;
                else if ( grade.value%10 == 8 || grade.value%10 == 9){
                    grade.value = (grade.value/10%10) *10 + 10;
                }
            }
            roundedGrades.add(grade);
        }
        return roundedGrades;
    }

}
