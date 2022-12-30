import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String arg[])
    {
        int num;
        int multi;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number: ");
        num=sc.nextInt();

        

        for(int i=1;i<=10;i++)
        {
            multi= num*i;
            System.out.println(num +"*"+ i +"="+ multi);
        }
    }
    
}
