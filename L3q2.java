import java.util.Scanner;
public class L3q2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float fahrenheit = sc.nextFloat();
        float celsiusResult = ((fahrenheit-32)*5/9);
        System.out.println("The "+ fahrenheit +" fahrenheit is "+ celsiusResult +" celsius");
        sc.close();
    }
}