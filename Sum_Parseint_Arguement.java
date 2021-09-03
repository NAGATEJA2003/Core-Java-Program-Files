class Sum_Parseint_Arguement{
    public static void main(String[] args) {
        int array[] = new int[50];
        int length = args.length;
        for(int i=0; i<length; i++)
        {
            array[i]=Integer.parseInt(args[i]);
        }

        int count=0, num=0, flag=0;
        for(int i=0; i<length; i++)
        {
            num = array[i];
            if(num==6 && flag==0)
            {
                flag=1;
            }
            if(num==7 && flag==1)
            {
                flag=0;
                num=0;
            }
            if(flag==1)
            {
                num=0;
            }
            count=count+num;
        }

    System.out.println("Sum : "+count);
    }
}