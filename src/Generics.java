public class Generics <T extends Comparable<T>>{
    T str1,str2,str3;
    public Generics(T str1,T str2,T str3){
        this.str1=str1;
        this.str2=str2;
        this.str3=str3;
    }
    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome To Find Maximum Value Problem Using Generics \n");
        System.out.println("The maximum value between the three Number is : " +maxOfValues(1,9,3));
        System.out.println("The maximum value between the three Number is : " +maxOfValues(2.35f,3.57f,7.37f));
        System.out.println("The maximum value between the three Number is : " +maxOfValues("SSK","ABC","DSA"));
    }
}