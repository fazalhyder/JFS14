import java.util.*;
public class LinkedListDemo	{
	public static void main (String[] args){
		LinkedList a = new LinkedList();
		a.addLast("java ");
		a.add("Angular ");
		a.addFirst("ReactJS ");
		a.add("JavaScript ");
		a.add("Python ");
		System.out.println(a.size());
		System.out.println("Original contents of a: ");
ListIterator itr = a.listIterator();
while (itr.hasNext()) {
System.out.println(itr.next());
}
ListIterator litr = a.listIterator();
while (litr.hasNext()) {
String element = (String) litr.next();
litr.set(element + "+");
}
// Now, display the list backwards.
System.out.println("Modified list backwards: ");
while (litr.hasPrevious()) {
System.out.println(litr.previous());
}
		
		
		
	}
}