// import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {

     // Switch Case Statement
        String var= "Mahesh";
        switch(var)
        {
                case "Mahesh":
                System.out.println("You are going to become an adult...!!!");
                break; // Thod/ break the statement and bahar nikal jao...!!!
                case "Vikrant":
                System.out.println("You are going to join a job..!!!");
                break;
                case "Sanket":
                System.out.println("You are going to get retired.!!!");
                break;
            default:
                System.out.println("Enjoy your Life...!!!");
        }
        System.out.println("Thanks for using my JAVA Code....");



      /*
       // it conditional Statement is Know as if else if lader
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the Age: ");
        age = sc.nextInt(); if(age>56){
            System.out.println("You are Experienced");
        }
        else if (age>46)
        {
            System.out.println("You are Semi- Experienced");
        }
        else if (age>36)
        {
                System.out.println("You are semi- semi- Experienced");
        }
        else
        {
            System.out.println("You are not Experienced");
        }*/
    }
}
