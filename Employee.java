//.......INHERITANCE......//
public class Employee {
    public static void main(String[]args){
        Programmer p1 = new Programmer();
        JavaProg j1 = new JavaProg();
        Employe e1 = new JavaProg();
        Programmer p2 = new JavaProg();
        System.out.println("salary of emp " + p1.salary);
        System.out.println("Bonus of emp " + p1.bonus);
        System.out.println("Extra is " + j1.extra);
    }
}
class Employe{
    int salary = 123500;
}
class Programmer extends Employe{
    double bonus =55000.55;
}
class JavaProg extends Programmer{
    double extra = 12435;
}
