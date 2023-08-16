import java.util.Scanner;
import java.util.random.RandomGenerator;

public class CWH_20_RPS_EC2_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value between 0/1/2: ");
        int uservalue = sc.nextInt();
        if (uservalue==0)
        {
            System.out.println("Rock");
        }
        else if (uservalue==1)
        {
            System.out.println("Paper");
        }
        else if (uservalue==2)
        {
            System.out.println("scissors");
        }
        else
            System.out.println("Please Enter valid Value between 0/1/2....!!!");
    }
}
