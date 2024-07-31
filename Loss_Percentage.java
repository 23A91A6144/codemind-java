import java.util.*;
public class Percentage{
    public static void main(String[] args)
    {
        int x,y;
        double z;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        z = (x-y)*100.0/(x);
        System.out.printf("%.2f",z);
    }
}