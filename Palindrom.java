public class Reverse_Number {
    public static void main(String[] args) {
    String charnum=args[0], reveString="";
    for(int i=args[0].length()-1; i>=0; i--)
    {
        reveString+=charnum.charAt(i);
    }

    // int b=reveString.compareTo(charnum); gives 1 0 -1 when comparing
    if(reveString.equals(charnum))
    {
        System.out.println(charnum+" "+reveString+" "+"It is a Palindrome");
    }
    else
    {
        System.out.println(charnum+" "+reveString+" "+"It is not a Palindrome");
    }
}    
}
