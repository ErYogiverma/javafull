// public class Star{ 
//     public static void main(String[]args){
//         System.out.println("111");
//         for(int i =1; i<=5; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }    
//     }
// }
public class Star{
    public static void main(String[]args){
        int num = 5;
        for (int i = 1; i <= num; i++){
            for (int j=0; j < num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j <i*2; j++){

            System.out.print("*");
            }
        System.out.println();
        } 
    }
}