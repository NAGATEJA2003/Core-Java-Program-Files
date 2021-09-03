import java.util.Scanner;
public class Input_Scanner {
    public static void main(String[] args) {
        Scanner input_function = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a =input_function.nextInt();
        System.out.print("Enter the Second Number : ");
        int b =input_function.nextInt();
        input_function.close();

        System.out.println("Entered Numbers are :"+"\n1. "+a+"\n"+"2. "+b);
        
        


    }
    
}
