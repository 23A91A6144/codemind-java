import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",c);
    }
}