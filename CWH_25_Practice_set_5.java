import java.util.Scanner;

public class CWH_25_Practice_set_5 {
    public static void main(String[] args) {
        //Practice Problem 1
//        Print Patten Like
//            ****
//            ***
//            **
//            *
//        int n=4;
//        for (int i=n; i>0; i--)
//        {
//            for (int j=0;j<i;j++)
//            {
//                System.out.print("*");
//            }
//               System.out.print("\n");
//        }
        // alternate Way of Printing Pattern Like Problem 1
//        int n=4;
//        for (int i=0; i<n; i++)
//        {
//            for (int j=n;j>i;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        //Practice Problem 2
//        int sum =0,i=0;
//        int n=4;
//        while (i<n)
//        {
//            sum = sum+(2*i);
//            i++;
//        }
//        System.out.println("Sum of Even Number is: "+sum);
        //Practice Problem 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Table Number which can you want");
//        int n = sc.nextInt();
//        System.out.println(n+"th Number Table is: ");
//        for (int i=1;i<=10;i++)
//        {
//            System.out.printf("%d x %d = %d\n",n,i,n*i);
//        }
        //Practice Problem 4
        // Decrementing FOR LOOP
//        int n=10;
//        for (int i=10;i>0;i--)
//        {
//            System.out.printf("%d x %d = %d\n",n,i,n*i);
//        }
        //Practice Problem 5
        // What is Factorial n= n*(n-1)*(n-2)*...*1
        // 5!=5*4*3*2*1= 120
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter Number which you want to get Factorial:- ");
//        int n= sc.nextInt();
//        int factor =1;
//        for (int i=n;i>0;i--)
//        {
//            factor= factor*i; // else you can write as factor*= i
//        }
//        System.out.print("The value of "+n+"th factorial is: "+factor);
        //Practice Problem 6
        // Factorial Problem Solve using While LOOP as given as you can see
//        int n=5,i=0;
//        int factorial = 1;
//        while (i<5)
//        {
//            i++;
//            factorial*= i;
//        }
//        System.out.println(factorial);
        //Practice Problem 7
//        int n =4,i=0;
//        while (i<4)
//        {
//            for (int j=4;j>0;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println("*");
//            i++;
//        }
        //Practice Problem 8
        // Yes We can Write or Solve Problem using any Loop with Correct Syntax
        //Practice Problem 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table Number which can you want");
        int n = sc.nextInt();
       // int n = 8;
        int sum = 0;
      //  System.out.println(n+"th Number Table is: \n");
        for (int i = 1; i <= 10; i++)
        {
            sum = sum + n * i;
        }
            System.out.println("Enter the Sum of table Addition " + sum);
        }
    }
