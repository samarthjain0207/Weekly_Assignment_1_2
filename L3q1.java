import java.util.Scanner;
public class L3q1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        float farenheitResult = ((celsius*9/5)+32);
        System.out.println("The "+ celsius +" celsius is "+ farenheitResult +" fahrenheit");
        sc.close();
    }
}