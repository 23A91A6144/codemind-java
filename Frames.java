import java.util.*;
public class Frames{
    public static void main(String[] args)
    {
        int x,y,z,a;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        z = read.nextInt();
        a = 2*(x+y)*z;
        System.out.println(a);
    }
}