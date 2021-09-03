import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String a = input.nextLine();
        int count=0, spacecount=0, flag=0;
        for(int i=0; i<a.length(); i++)
        {
            if(Character.isAlphabetic(a.charAt(i))==true)
            {
                count = count + 1;
                flag = 0;
            }
            else if(a.charAt(i)==' ')
            {
                if(i==0 || i==a.length())
                {
                    flag=0;
                    spacecount = spacecount + 0;
                }
                else if(flag==0)
                {
                    flag=1;
                    spacecount = spacecount + 1;
                }
            }
        }
        // -System.out.println("No of numbers in the Given String "+ a +" is : "+count);
        if(count+spacecount == a.length())
            System.out.println("Given string is a pure alaphabetic string with "+spacecount+" words");
        else
            System.out.println("There are some other characters or numbers in the given string");
        input.close();
    }
}
