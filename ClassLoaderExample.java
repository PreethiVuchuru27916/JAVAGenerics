import java.lang.*;
public class ClassLoaderExample {
    public static void main(String args[]) {
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());//Prints the classloader name of the current class. Application or system assloader will load the class.
        System.out.println(String.class.getClassLoader());
    } 
}