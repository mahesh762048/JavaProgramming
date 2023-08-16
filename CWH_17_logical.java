public class CWH_17_logical {
    public static void main(String[] args) {
        // Logical Operator in JAVA < && (AND), ||(OR), !(NOT) >
        System.out.println("For Logical AND.....");
        boolean a = true;
        boolean b = false;
        if(a && b)
        {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("For Logical OR.....");
        boolean a1 = true;
        boolean b1 = false;
        if(a1 || b1)
        {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("For Logical NOT....");
        System.out.print("Not(A) is ");
        System.out.println(!a);
        System.out.print("Not(B) is ");
        System.out.println(!b);
    }
}
