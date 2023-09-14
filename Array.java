//.............Single Dimensional Array...........//

// import java.util.Scanner;

// public class Array{
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);
//         int [] arr1 = {2,5,1,5,3};
//         int [] arr2 = new int[5];
//         for (int i = 0; i < arr2.length; i++){
//             arr2[i] = scanner.nextInt();
//         }
//         for (int i = 0; i < arr2.length; i++){
//             System.out.print(arr2[i] + " ");
//         }
//         //...Traversing using for-Each loop
//         for(int x:arr1){
//             System.out.println(x + " ");
//         }
//     }
// }

//............Multi Dimensional Array...........//

public class Array{
    public static void main(String[]args){
        int [][] arr = {{3,4},{2,9},{2,6,5}};
        int [][] matrix = new int[5][5];
        System.out.println(arr[1][1]);
    }
}

//..........Printing a 2D Array........//

// public class Array{
//     public static void main(String[]args){
//         int [][] arr = {{3,4},{2,9},{2,6}};
//         int [][] matrix = new int[3][3];
//         for (int i = 0; i< arr[i].length; i++){
//             System.out.print(arr[i][j] + " ");
//         }
//         System.out.println();
//     }
    
// }