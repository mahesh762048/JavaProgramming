public class CWH_27_display_differ_typearrays {
    public static void main(String[] args) {
/*        float[] marks={100, 50.2f, 20.35f, 60.52f, 50.64f};
        String[] students = {"Mahesh", "Sanket", "Rajesh"};
        System.out.println(students.length);
        System.out.println(students[0]);
        */

//         int[] marks ={100, 50, 20, 60, 50};
       // System.out.println(marks.length); // Which Gives length of array
        // Displaying Array (Navive Way)
        /* System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);
         System.out.println(marks[3]);
         System.out.println(marks[4]);
         */
        // Displaying Array (for LOOP)
       // System.out.println("Printing using FOR LOOP:-");
       /* for (int i =0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        */
        // Displaying Array in Reverse Order (for LOOP)
         /*System.out.println("Displaying Array using FOR LOOP in Reverse Order:-");
        int[] marks ={100, 50, 20, 60, 50};
        for (int i = marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
          */
//         Displaying Array in Reverse Order (for- each LOOP)
         System.out.println("Displaying Array using FOR- each LOOP:-");
        int[] marks ={100, 50, 20, 60, 50};
        for (int element : marks)
        {
            System.out.println(element);
        }
        // For each Loop in Array




    }
}
