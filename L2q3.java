import java.util.Scanner;
public class L2q3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int peri = sc.nextInt();
        int side = peri/4;
        System.out.println("The length of the side is "+ side +" whose perimeter is "+ peri);
        sc.close();
    }
}