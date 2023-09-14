import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int x = sc.nextInt(); 
        char c ='E';
        if (x>90){
            c='A';
        }else if (x>80){
            c='B';
        }else if(x>70){
            c='C';
        }else if(x>60){
            c='D';
        }

        switch(c){
            case 'A':
                System.out.println("Excellent");
                break;

           case 'B':
                System.out.println("Very Good");
                break;
            
            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Poor");
                break;

            default:
                System.out.println("Failed");
                break;        

        }
        System.out.println("Your grade is :" + c);




    }
}