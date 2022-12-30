


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

       
        MyNum s2= new MyNum(num);
        
        
        if (s2.isEven())
        {
            System.out.println("Number Is Even");
        }
        else{
            System.out.println("Number Is Not Even");
        }
    }
    }


