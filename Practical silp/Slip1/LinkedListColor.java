import java.util.*;


class LinkedListColor 
{
public static void main(String[] args) 
{
LinkedList ll = new LinkedList();
ll.add("Red");
ll.add("Blue");
ll.add("Yellow");
ll.add("Orange");
Iterator i = ll.iterator();
System.out.println("\ncontents of the List using an Iterator:\n");
while (i.hasNext()) {
String s = (String) i.next();
System.out.println(s);
}
ListIterator li = ll.listIterator();
while (li.hasNext()) {
// String elt = (String)
li.next();
}
System.out.println("\ncontents of the List in reverse order using a ListIterator : ");
while (li.hasPrevious()) {
System.out.println(li.previous());
}
ll.add(2, "Pink"); // add element at second position
ll.add(3, "Green"); // add element at 3rd position
System.out.println("\nlist between blue and yellow is:");
System.out.println(ll);
}
}