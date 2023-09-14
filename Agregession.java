public class Agregession {
    public static void main(String[]args){
        Address ad = new Address();
        ad.State = "MP";
        ad.city = "INDORE";
        ad.pin = 2001;
        ad.houseNo =143;
        Employee1 emp1 = new Employee1();
        emp1.id = 123;
        emp1.name = "Yogi";
        emp1.add = ad;
        System.out.println(emp1.add.city);
    }
}
class Address{int houseNo; String city; String State; int pin;}
class Employee1{int id; String name; Address add;}
