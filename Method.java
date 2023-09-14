// public class Method{
//     public static void main(String[]args){
//         int num1=10;
//         int num2=20;
//         int sum= calculateSum(num1, num2);//method call 
//         System.out.println("The sum is:" +sum);//built-in method call 
//     }
//     // method definition 
//     public static int calculateSum(int num1, int num2){
//         int sum= num1+num2;
//         return sum;
//     }
// // }
// public class Method{
//     static int m1(int data){
//         data=8;
//         return data;
//     }
//     public static void main(String[]args){
//        // Method ob1 = new Method();
//         int data=9;
//         data=m1(data);
//         System.out.println(data);
//     }
// }
public class Method{
    int data;
    static void m1(Method obj1){
        obj1.data=66;
    }
    public static void main(String[]args){
        Method ob1=new Method();
        ob1.data=45;
        m1(ob1);
        System.out.println(ob1.data);
    }
}