public class HeInherit {
    public static void main(String[] args) {
        Cat nancy = new Cat();
        System.out.println("Nancy's Sweet voice is" + nancy.says);
        System.out.println("Nancy: " + nancy.legs);
        Dog Mochi = new Dog();
        System.out.println("Mochi barks: " + Mochi.shouts);
        System.out.println("Mochi: " + Mochi.legs);    
    }
}
class Animal{String legs = "Has 4 legs";}
class Cat extends Animal{ String says = "Meow!!";}
class Dog extends Animal{ String shouts = "Bhow!!";}