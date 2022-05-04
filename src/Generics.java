import java.lang.*;
public class Generics {
 public static <T extends Comparable<T>> T maxOfValues(T str1,T str2,T str3) {
        T max = str1;
        if (str1.compareTo(max) > 0)
            max = str2;
        if (str3.compareTo(max) > 0)
            max = str3;
        return max;
    }

    public static void main(String[] args) {
        Generics generics=new Generics();
        System.out.println("\nWelcome To Find Maximum Value Problem Using Generics \n");
        System.out.println("The maximum value between the three Number is : " +generics.maxOfValues("SSK","ABC","DSA"));
        System.out.println("The maximum value between the three Number is : " +generics.maxOfValues(3,7,8));
        System.out.println("The maximum value between the three Number is : " +generics.maxOfValues(1.35f,2.67f,3.35f));
    }
}