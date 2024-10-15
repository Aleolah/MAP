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

      //2
      Aufgabe2 aufgabe2 = new Aufgabe2();
      int n = 7;
      int[] arr = {4, 8, 3, 10, 17};
      int max = aufgabe2.maximal(arr);
      int min = aufgabe2.minimal(arr);
      int sum_max = aufgabe2.max_sum(arr);
      int sum_min = aufgabe2.min_sum(arr);
//      System.out.println( "MAX " + max);
//      System.out.println("MIN " + min);
//      System.out.println( "MAX SUM " + sum_max);
//      System.out.println( "MIN SUM " + sum_min);


    //3
      Aufgabe3 aufgabe3 = new Aufgabe3();
      int[] a = {1,3,0,0,0,0,0,0,0};
      int[] b ={ 8,7,0,0,0,0,0,0,0};
      int[] c ={2,2,2,2,2,0,0,0,0};
      int[] d ={1,1,1,1,1,0,0,0,0};
      int e = 2;
      int[] f ={3,2,1,3,2,1,3,2,1};

      //aufgabe3.sum(a, b);
      //aufgabe3.diff(c,d);
      //aufgabe3.mul(f,e);
      //aufgabe3.div(c,2);

      //4
      Aufgabe4 aufgabe4 = new Aufgabe4();
      int[] tastature = {40, 35, 70, 15, 45};
      int[] usb = {20, 15, 40, 15};
      int[] prices = {15, 45, 20};
      int[] tastature1 = {40,50,60};
      int[] tastature2 = {8,12};
//      aufgabe4.cheapestTastature(tastature);
//      aufgabe4.expensiveObject(tastature,usb);
//      aufgabe4.expensiveUsb(prices,30);
//      aufgabe4.maximBuget(60,tastature1,tastature2);











    }
}