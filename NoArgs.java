public class NoArgs {
    NoArgs(){
        System.out.println("inside constructor");
    }
    public static void main(String[] args) {
    new NoArgs(); // error: no-args constructor cannot be applied to given types;
        
    }
}
