import java.util.Scanner;

public class CWH_22_Ch5_do_while_loop {
    public static void main(String[] args) {
        // While Loop ------> Check the Condition and Execute the Code
        // Do While Loop ---> Execute the Code and then Check the Condition
//        int a =0;    // Do while is enter in Loop Without checking While Condition 1st time(At least One Time)
//        do {
//            System.out.println(a);
//            a++;
//        }while (a<5);
        // Exercise Quize
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural number last range:");
        int num = sc.nextInt();
        int i=1;
        System.out.println("It is the natural Number till "+num);
        do {
            System.out.println(i);
            i++;
        }while (i<=num);
    }
}
