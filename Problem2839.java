import java.util.Scanner;
public class Problem2839
{
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        
        int number1 = input1.nextInt();

        if (number1 >= 3 && number1 <= 5000)
        {
            System.out.println("Hello world" + number1);
        }
        input1.close();
    }
}