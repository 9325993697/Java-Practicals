import java.io.*;
class InvalidDateException extends Exception
{}
class Date
{
    
    int day,month,year;
    public void accept(int dd,int mm ,int yy)throws IOException
    {
       day=dd;
       month=mm;
       year=yy;
    }
    public void display()
    {
        System.out.println("Date is---> "+day+"/"+month+"/"+year);
    }
}
class MyDate
{
    public static void main(String []ar)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Date: ");
        int day=Integer.parseInt(br.readLine());
        int month=Integer.parseInt(br.readLine());
        int year=Integer.parseInt(br.readLine());
        int flag=0;
        try
        {
            if(month<=0 || month>12)
            {
                throw new InvalidDateException();
            }
            else
            {
                if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
                {
                    if(day>=1 &&  day<=31)
                        flag=1;
                    else
                        throw new InvalidDateException();
                }
                else if(month==2)
                {
                    if(year%2==0)
                    {
                        if(day>=1 && day<=29)
                        {
                            flag=1;
                        }
                        else throw new InvalidDateException();
                    }
                }
                else
                {
                    if(month==2 || month==4 || month==6 || month==9 || month==11)
                    {
                        if(day>=1 && day<=30)
                        {
                            flag=1;
                        }
                        else throw new InvalidDateException();
                    }
                }
            }
            if(flag==1)
            {
                Date m=new Date();
                m.accept(day,month,year);
                m.display();
            }
           
        }
        catch(InvalidDateException x)
        {
           System.out.println("Date is Invalid!!!! please enter valid date");
        }
        
    }
}
