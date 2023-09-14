public class ArgsCons {
    int x;
    ArgsCons(int x){
        this.x = x;
    }
    //ArgsCons(int y){
      //  x= y;
    //}
    public static void main(String[]args) {
        ArgsCons obj1 = new ArgsCons(5);
        System.out.println(obj1.x);
        ArgsCons obj2 = new ArgsCons(3);
        System.out.println(obj2.x);
    }
}
