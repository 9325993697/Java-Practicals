import java.io.*;
import java.io.IOException;

class S_stud
{
    int rollno;
    String name;
    float perc;
    S_stud(int a,String b,float c)
    {
        this.rollno=a;
        this.name=b;
        this.perc=c;
    }
    public void getData()throws IOException
    {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter roll no: ");
        int rollno=Integer.parseInt(br.readLine());
        System.out.println("Enter Name: ");
        String name=br.readLine();
        System.out.println("Enter percentage: ");
        float perc=Float.parseFloat(br.readLine());
    }
    public void display()
    {
        System.out.println("Roll No--> "+rollno+"Name --> "+name+"Percentage --> "+perc);
        System.out.println("------------------------------------------------------------------");
    }



public class Student
{
    
    public static void main(String []ar)throws IOException
    {
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter number of students: ");
        // int num=Integer.parseInt(br.readLine());
        S_stud d[]=new S_stud[3];
        
        
        for(int i=0;i<3;i++)
        {
            d[i].getData();
            d[i].display();
        }
    }    
}
}
