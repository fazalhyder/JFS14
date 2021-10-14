import java.util.Vector;
import java.util.Enumeration;
class EnumerationDemo {
public static void main(String[] args) {
Vector v = new Vector();
v.addElement("java ");
		v.addElement("Angular ");
		v.addElement("ReactJS ");
		v.addElement("JavaScript ");
		v.addElement("Python ");

System.out.println(v);
System.out.println("Printing the elements using For each ");
for (Object object : v) {
System.out.println(object);
}
System.out.println("Printing the elements using Enumaration");
Enumeration e = v.elements();
while (e.hasMoreElements()) {
System.out.println(e.nextElement());

}
}
}