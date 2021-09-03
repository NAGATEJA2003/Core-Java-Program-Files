public class Duplicate_Array {
    public static void main(String[] args)
    {
        int array[] = new int[args.length];
        int max=0;
        for(int i=0; i<args.length; i++)
        {
            array[i]=Integer.parseInt(args[i]);
            if(max<array[i])
            {
                max=array[i];
            }
        }
        boolean array1[] = new boolean[max+1];
        for(int i=0; i<args.length; i++)
        {
            if(array1[array[i]]==false)
            {
                System.out.print(array[i]+" ");
                array1[array[i]]=true;
            }
        }
    }
}
