//......INTERFACES.....//
interface I1{
    void Go();
}
interface I2{
    void push();
}
public class Yogi implements I1,I2{
    public void Go(){
        System.out.println("Hello");
    }
    public void push(){
        System.out.println("teri ma ki");
    }
        public static void main(String[] args) {
            Yogi y1 =new Yogi();
            y1.Go();
            y1.push();
    }
    
}
// interface t1{
//     void chalo();
// }
// interface t2{
//     void chalo1();
// }
// public class demo1 implements t1,t2 {
//     public void chalo(){
//         System.out.println("this is chalo");
//     }
//      public void chalo1(){
//         System.out.println("this is chalo1");
//     }
//     public static void main(String[] args) {
//         demo1 a1=new demo1();
//         a1.chalo();
//         a1.chalo1();
//     }
// }

