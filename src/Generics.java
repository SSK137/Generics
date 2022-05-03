public class Generics {
 public float maxOfValues(float a1, float a2,float a3) {
        float max = a1;
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
        System.out.println("The maximum value between the three Number is : " +generics.maxOfValues(1.5f,2.35f,5.36f));
    }
}