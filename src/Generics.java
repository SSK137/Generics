public class Generics <T extends Comparable<T>>{
    T str1,str2,str3,str4,str5;
    public Generics(T str1,T str2,T str3,T str4,T str5){
        this.str1=str1;
        this.str2=str2;
        this.str3=str3;
        this.str4=str4;
        this.str5=str5;
    }
    public static <T extends Comparable<T>> T maxOfValues(T str1, T str2, T str3,T str4,T str5) {
        T max = str1;
        if (str2.compareTo(max) > 0)
            max =str2;
        if (str3.compareTo(max) > 0)
            max = str3;
        if (str3.compareTo(max) > 0)
            max = str4;
        if (str3.compareTo(max) > 0)
            max = str5;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("\nWelcome To Find Maximum Value Problem Using Generics \n");
        System.out.println("The maximum value between the three Number is : " +maxOfValues(1,9,3,12,5));
        System.out.println("The maximum value between the three Number is : " +maxOfValues(2.35f,3.57f,7.37f,1.1f,2.95f));
        System.out.println("The maximum value between the three Number is : " +maxOfValues("SSK","ABC","DSA","GFT","FZS"));
    }
}