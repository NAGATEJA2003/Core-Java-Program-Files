public class Type_casting {
    public static void main(String[] args) {
        
        // byte -> short -> char -> int -> long -> float -> double = Widening casting (Smaller to Larger)
        // double -> float -> long -> int -> char -> short -> byte = Narror casting (Larger to Smaller)

        int myInt=9;
        double myDouble=myInt;
        char myChar='A';
        int myInt1=myChar;

        double myDouble1=65;
        int myInt3=(int)myDouble1;
        float myChar1=(char)myDouble1;

        System.out.println("Widening Casting Int to Double : "+myInt+" , "+myDouble);
        System.out.println("Widening Casting Char to Int : "+myChar+" , "+myInt1);

        System.out.println("Narrow Casting Double to Int : "+myDouble1+" , "+myInt3);
        System.out.println("Narrow Casting Double to Char : "+myDouble1+" , "+myChar1);
    }
}