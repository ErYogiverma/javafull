//.......Reverse a number of array............//
public class Arrayreverse{
    public static void main(String[]args){
        int [] arr = {2,65,3,2,124,1};
        reverse(arr);
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
    //To reverse a given array 
    public static void reverse(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}