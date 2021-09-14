import java.io.*;
/*
public class Buffered_Reader {
    public static void main(String[] args)throws Exception {
        InputStreamReader r =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String num1="";
        String num2="";

        System.out.print("Enter the 1st number : ");
        num1 = br.readLine();
        System.out.print("Enter the 2nd number : ");
        num2 = br.readLine();

        int nu1 = Integer.parseInt(num1);
        nu1 = Integer.parseInt(num2) + nu1;

        System.out.println("The sum of the two numbers is "+nu1);

    }
}

*/

public class Buffered_Reader {
    public static void main(String[] args)throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int total=0;
        String n="";

        System.out.print("Enter the no of subjects : ");
        n = br.readLine();
        int num = Integer.parseInt(n);

        for(int i=0; i<num; i++)
        {
            String marks = "";
            System.out.print("Enter the marks of No."+(i+1)+" Subject : ");
            marks = br.readLine();
            total = total + Integer.parseInt(marks);
        }

        System.out.println("Total marks of the "+num+" Subjects is : "+total);
        System.out.println("Average marks of the "+num+" Subjects is : "+(total/num));
    }
}