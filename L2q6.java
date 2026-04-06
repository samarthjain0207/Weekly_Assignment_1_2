import java.util.Scanner;
public class L2q6{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float q = n1/n2;
        float r = n1%n2;
        System.out.println("The Quotient is "+ q +" and Remainder is "+ r +" of two number "+ n1 +" and "+ n2);
        sc.close();
    }
}