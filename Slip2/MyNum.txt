


public class MyNum {
     
    private static int num;

    public MyNum()
    {
        num=0;
    }

    public MyNum(int n)
    {
        this.num=n;

    }

    public boolean isNegative()
    {
        if(num <0)
        {
            return true;

        }else
        return false;

    }

    public boolean isPositive()
    {
        if (num>=0)
        return true;

        else
        return false;

    }

    public boolean isOld()
    {
        if (num % 2 != 0)
        return true ;
        else
        return false;

    }

    public boolean isEven()
    {
        if(num% 2 ==0)
        return true;

        else
        return false;
    }

    public static void main(String arg[])
    {
        num= Integer.parseInt(arg[0]);

        MyNum s1= new MyNum();
        MyNum s2= new MyNum(num);
        
        if (s1.isNegative())
        {
            System.out.println("Number Is Negative");
        }
        if (s2.isNegative())
        {
            System.out.println("Number Is Negative");
        }
        if (s1.isPositive())
        {
            System.out.println("Number Is Positive");
        }
        if (s2.isPositive())
        {
            System.out.println("Number Is Positive");
        }
        if (s1.isOld())
        {
            System.out.println("Number Is Old");
        }
        if (s2.isOld())
        {
            System.out.println("Number Is Old");
        }
        if (s1.isEven())
        {
            System.out.println("Number Is Even");
        }
        if (s2.isEven())
        {
            System.out.println("Number Is Even");
        }
    }
    }


