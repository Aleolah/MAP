//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aufgabe1 aufgabe1 = new Aufgabe1();
        //1
      Grades grades = new Grades();
      grades.addGrades( new Grade(21));
      grades.addGrades( new Grade(73));
      grades.addGrades( new Grade(90));
      grades.addGrades( new Grade(99));
      grades.addGrades( new Grade(38));
      Grades insufgrades = new Grades();
      insufgrades = aufgabe1.insufficient_grades(grades);
      //insufgrades.printGrades();
        // 2
        Grades grades2 = new Grades();
        grades2.addGrades( new Grade(20));
        grades2.addGrades( new Grade(37));
        grades2.addGrades( new Grade(40));
        double average = aufgabe1.average(grades2);
        //System.out.println(average);
        //3
        Grades grades3 = new Grades();
        grades3.addGrades( new Grade(20));
        grades3.addGrades( new Grade(73));
        grades3.addGrades( new Grade(45));
        grades3.addGrades( new Grade(58));
        grades3.addGrades( new Grade(99));
        grades3.addGrades( new Grade(37));
         Grades roundedGrades = new Grades();
         roundedGrades = aufgabe1.roundedGrades(grades3);
         //roundedGrades.printGrades();
         //4
        Grades grades4 = new Grades();
        grades4.addGrades( new Grade(20));
        grades4.addGrades( new Grade(31));
        grades4.addGrades( new Grade(77));
        grades4.addGrades( new Grade(88));
        grades4.addGrades( new Grade(99));
        Grade maxgrade = new Grade(0);
        maxgrade = aufgabe1.maxRoundedGrade(grades4);
        //maxgrade.printGrade();










    }
}