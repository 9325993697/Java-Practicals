import java.util.*;

class Array

{

    public static void main(String a[])

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Limit of ArrayList :");

        int n=sc.nextInt();

        ArrayList alist=new ArrayList();

        System.out.println("Enter Elements of ArrayList :");

        for(int i=0;i<n;i++)

        {

            String elmt=sc.next();

            alist.add(elmt);

        }

        System.out.println("Original ArrayList is :"+alist);
        
        

    }

}