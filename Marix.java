public class Marix {
     public static void main(String[] args) {
        int [][]mat1= {{2,5,3},{1,2,3},{5,6,0}};
        int [][]mat2= {{1,5,3},{1,4,1},{6,6,2}};
        // System.out.println(arr1[0][0]);
        // System.out.println(arr1[0][0]);
        // System.out.println(arr1[0][0]);
        // System.out.println(arr1[0][0]);
        // System.out.println(arr1[0][0]);
        // System.out.println(arr1[0][0]);
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[0].length; j++){
                System.out.print (mat1[i][j]+mat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
