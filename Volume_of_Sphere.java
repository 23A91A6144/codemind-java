import java.util.*;
public class sphere {
    public static void main(String[] args)
    {
        int r;
        double x;
        Scanner read = new Scanner(System.in);
        r = read.nextInt();
        x = (4.0/3.0)*r*r*r*(3.14);
        System.out.printf("%.2f",x);
    }
}