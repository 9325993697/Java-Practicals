public class RevNum {
    public static void main(String arg[])
    {
        int num= Integer.parseInt(arg[1]);
        int rev=0;

        while(num>0)
        {
            int remainder =num % 10;
            rev= rev * 10 + remainder;
            num=num / 10;

            
        }
        System.out.println("The revese number is "+rev);
    }
}