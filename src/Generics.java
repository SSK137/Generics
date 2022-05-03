public class Generics {
 public int maxOfValues(int a1,int a2,int a3) {
        int max = a1;
        if (a2 > max)
            max = a2;
        if (a3 > max)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        Generics generics=new Generics();
        Generics gns=new Generics();
        System.out.println("\nWelcome To Find Maximum Value Problem Using Generics \n");
        System.out.println("The maximum value between the three Number is : " +generics.maxOfValues(8, 9, 5));
    }
}