import java.util.*;
public class percentage {
    public static void main(String[] args)
    {
        int a,b;
        double c;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = (b-a)*100.0/a;
        System.out.printf("%.2f",c);
    }
}