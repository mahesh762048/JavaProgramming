import java.util.Scanner;
//Final Solution of CBSC marks Calculations.....!!!
public class CWH__06_Example_CBSC {
    public static void main(String[] args){
        System.out.println("Enter Student Marks detail");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths Marks: ");
        int a = sc.nextInt();
        System.out.print("Enter English Marks: ");
        int b = sc.nextInt();
        System.out.print("Enter Marathi Marks: ");
        int c = sc.nextInt();
        System.out.print("Enter Computer Marks: ");
        int d = sc.nextInt();
        System.out.print("Enter Physics Marks: ");
        int e = sc.nextInt();
        Float total_percentage = ((a+b+c+d+e)/500.0f)*100;
        System.out.print("Total Mark Percentage is: "+total_percentage+"%");
//        System.out.println(total_percentage);

    }
}
