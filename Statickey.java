public class Statickey {
    static int a = 10;
    static{
        System.out.println("static block");
    }
    {
        System.out.println("Instance block");
    }
    static int m1(){
        System.out.println("Inside m1");
        return 8;
    }
    static int fact(int n)
    {
        if (n <= 1)
            return 1;
        else
            return n *fact(n-1);
    }
    static int print(int n)
    {
        if(n==0) return 0;
        System.out.println(n);
        return print(n-1);
    }
    static int Fib(int N)
    {
        if ( N == 0 || N == 1)
            return N;

        return Fib(N-1) + Fib(N-2);
    }
    public static void main(String[]args){
        Statickey key = new Statickey();
        System.out.println(fact(5));
        System.out.println(Fib(3));
        print(5);
        // fibonacci
        System.out.println(0 +" ");
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println(b +" ");
        for (int i = 0; i< 10; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c +" ");
        }
    }
}
