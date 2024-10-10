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
    public double average (Grades grades){
        double average = 0;
        for(Grade grade : grades.grades){
            average += grade.value;
        }
        average /= grades.grades.size();

        return Double.parseDouble(String.format("%.2f", average));
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
    public Grade maxRoundedGrade(Grades grades){
        Grade maxGrade = new Grade(0);
        Grades roundedGrades = new Grades();
        roundedGrades = roundedGrades(grades);
        for (Grade grade : roundedGrades.grades) {
            if (grade.value > maxGrade.value)
                maxGrade = grade;

        }
        return maxGrade;
    }

}
