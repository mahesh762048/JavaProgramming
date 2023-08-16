import java.util.Scanner;

public class CWH_29_Ch6_practice_set6 {
    public static void main(String[] args) {
        // Practice Problem 1
      /*  float[] marks={100, 50.5f, 20.5f, 60.5f, 50.5f};
        float sum=0;
        for (int i=0;i<marks.length;i++)
        {
            sum = sum + marks[i];
        }
        System.out.println("Sum of Array is: "+sum);
       */
        // Practice Problem 2
      /*  Scanner sc =new Scanner(System.in);
        float[] marks={100.0f, 50.5f, 20.5f, 60.5f, 50.5f};
        System.out.println("Enter Finding Element:- ");
        float num= sc.nextFloat();
        Boolean isInArray = false;
        for (float element:marks)
        {
            if (num==element)
            {
                isInArray = true;
                break;

            }
        }
        if (isInArray){
            System.out.println("The is Present in Array");
        }
        else {
            System.out.println("The is NOT Present in Array");
        }
       */
        // Practice Problem 3
       /* int [] marks = {80,85,90};
        float sum=0;
        for (int element:marks) // Using For - each LOOP
        {
            sum = sum+element;
        }
        System.out.println("Average Marks of Students in Physics is: "+sum/ marks.length);

        */
        // Practice Problem 4
       /* int [][] mat1= {{1,2,3},{4,5,6}};
        int [][] mat2= {{5,2,7},{9,2,8}};
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format("Setting Value of i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Resulting Array :-");
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
              //  System.out.print(" ");
            }
            System.out.println("");
        }
        */
        // Practice Problem 5
       /* int [] arr = {1,2,3,587,471,2364,6,7};
        System.out.println("before Swaping Array is: ");
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        int l= arr.length;
        int temp;
        int n = Math.floorDiv(l,2); // floorDiv is used to calculate the Value of given NO.(5/2=2.5~2)
        for (int i=0;i<n;i++){
            //swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]= temp;
        }
        System.out.println("\nAfter Swapping Array is: ");
        for (int element:arr){
            System.out.print(element+" ");
        }
        */
        // Practice Problem 6
      /*  int [] arr = {1,2,3,587,471,2364,6,7};
        int max=0;
        for (int element:arr){
            if (element>max){
                max = element;
            }
        }
        System.out.print("Maximum Element in Array is: "+max);

       */
        /* int [] arr = {5,2,3,587,471,2364,6,7};
        int min = Integer.MAX_VALUE;
        for (int element:arr){
            if (element<min){
                min = element;
            }
        }
        System.out.print("The Minimum Element in Array is: "+min);

         */
        //    System.out.println(Integer.MIN_VALUE); // It gives the Lowest Minimum Value in the System
        //   System.out.println(Integer.MAX_VALUE); //It gives the Highest Maximum Value in the System
        // Practice Problem 8
        int [] arr = {1,12,3};
        boolean isSorted= true;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted= false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted...!!!");
        }
        else {
            System.out.println("The Array is NOt");
        }

    }
}
