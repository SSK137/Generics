public class Generics {
 public String maxOfValues(String  str1, String str2,String str3) {
        String max = str1;
        if (str1.compareTo(max) > 0)
            max = str2;
        if (str3.compareTo(max) > 0)
            max = str3;
        return max;
    }

    public static void main(String[] args) {
        Generics generics=new Generics();
        Generics gns=new Generics();
        System.out.println("\nWelcome To Find Maximum Value Problem Using Generics \n");
        System.out.println("The maximum value between the three Number is : " +generics.maxOfValues("SSK","ABC","DSA"));
    }
}