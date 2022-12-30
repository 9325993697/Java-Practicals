import java.util.*;
import java.io.*;

class Collection 
{
public static void main(String[] args) throws Exception
 {
int no, element, i;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
ArrayList ts = new ArrayList();
System.out.println("Enter the of elements :");
no = Integer.parseInt(br.readLine());

for (i = 0; i < no; i++) {
System.out.println("Enter the element : ");
element = Integer.parseInt(br.readLine());
ts.add(element);
}
System.out.println("The elements in sorted order :" + ts);

System.out.println("Enter element to be serach : ");
element = Integer.parseInt(br.readLine());

if (ts.contains(element))
System.out.println("Element is found");
else
System.out.println("Element is NOT found");
}
}