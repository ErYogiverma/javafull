public class Emp {
    public static void main(String[]args){
        Employee emp1=
        new Employee(12,50000,500.5,"Raj");
        System.out.println("name of Employee:" + emp1.name);
        System.out.println("salary of Employee:" + emp1.salary);
        System.out.println("bonus of Employee:" + emp1.bonus);
    }
}

class Employee{
    int id; int salary; double bonus; String name;

    public Employee(int id,int salary,double bonus,String name){
        this.id = id; this.salary = salary;  this.bonus = bonus;
        this.name = name;
    }
}
