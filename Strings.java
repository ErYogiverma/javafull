// // import java.util.Arrays;
// // public class Strings{
// //     public static void main(String[]args){
// //         String name="Yogi";
// //         System.out.println (name);
// //         for(int i = 0; i<5; i++){
// //             System.out.println(name);
// //         }
// //         System.out.println("Hello World!");
// //         String st1="Welcome";
// //         String st3="Welcome";
// //         String st2=new String("Welcome");
// //         String st4=new String("Welcome");
// //         System.out.println(st1 == st2);
// //         System.out.println(st1.equals(st2));
// //         System.out.println(st2 == st4);
// //         System.out.println(st2.equals(st4));
// //         System.out.println(st1.charAt(2));// When you want to add a character so....
// //         System.out.println(st1.codePointAt(1));// When you want to know a character value....
// //         System.out.println(st1.codePointBefore(1));// When you want to know a character real value....
// //         System.out.println(st1.compareTo(st2));// When you want to compare a two strings....
// //         System.out.println(st1.concat(st3)); // When you want to add to values so....
// //         System.out.println(st1.concat(" ").concat(st3));// When you want a space in character so....
// //         System.out.println(st1.contains("asd"));// When you want to know about a character/ strings is availabe or not in main character so..
// //         System.out.println(st1.contains("el"));// When you want to check a character is available so....
// //         System.out.println(st1.isEmpty());
// //         System.out.println(st1.indexOf("el"));
// //         char[] cArray = new char[5];
// //         char[] cA = {'a','v','d'};
// //         String[] stAr = new String[2];
// //         String[] stAr2 = {"Mango","Banana","Grapes"};
// //         Arrays.sort(cA);
// //         String st5 = new String(cA);
// //         System.out.println(st5);
// //         System.out.println(st5.length());
// //         char[] cA2 = st1.toCharArray();
//        // System.out.println(reverse("Welcome"));
//         //String str = "Hey";
//         //System.out.println(str.trim());
//        // System.out.println(st1.replace("el,e"));
//   //  }

// //}

// // public static String reverse(String str){
// //     String rev = "";
// //     for (int i = str.length()-1; i >=0; i--){
// //         rev = rev + str.charAt(i);
// //     }
// //     return rev;
// // }

// //.............Question-> Reverse a string........//

// // public class Strings {

// //   public static void main(String[]args) {
// //     String str = "Yogi";
// //     char ch[] = str.toCharArray();
// //     System.out.println(ch[0]);

// //     for (int i = ch.length - 1; i >= 0; i--) {
// //         System.out.println(ch[i]);
// //     }
    
// //   }
// // }

// // ...........Question-> Reverse String sentences.....//

// public class Strings{
//     public static void main (String[]args){
//         String str = "This is string";
//         String[] stArray = str.split(" ");
//         for(int i = stArray.length-1; i >=0; i--){
//             System.out.print(stArray[i] + " ");
//         }
//     }
// }

// .......String Buffer...........//

// public class Strings{
//     public static void main (String [] args){
//         String st = "asdf";
//         StringBuffer obj1 = new StringBuffer(st);
//         System.out.println(obj1.capacity());
//        // System.out.println(obj1);
//         for(int i = 0; i<20; i++){
//             obj1.append(i);
//         }
//         obj1.reverse();
//         obj1.length();
//         obj1.insert(5,"ww");
//         obj1.replace(1,2,"d");
//         obj1.delete(1,2);
//         obj1.indexOf("a");
//         System.out.println(obj1);
//     }
// }

//........Question-> Create a String From A to Z...//

public class Strings{
    public static void main(String[]args){
    StringBuffer sb = new StringBuffer();
    char c = 'a';
    for (int i = 0; i<26; i++){
        char a = (char)(97 +i);
        sb.append(a);
        }
    System.out.println(sb);
    
    }
}
