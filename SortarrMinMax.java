public class SortarrMinMax{
    public static void main(String[]args){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = {2,5,2,45,8};
        for(int x:arr) {
            max = Math.max(max,x);
            min = Math.min(min,x);
        }
        System.out.println("Max no. is :" + max);
        System.out.println("Min no. is :" + min);
    }
}