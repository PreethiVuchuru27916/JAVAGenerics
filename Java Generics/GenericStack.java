import java.util.*;
public class GenericStack<T>{
    private List<T> li = new ArrayList<T>();
    
    public void push(T value) {
        li.add(value);
    }

    public void pop() {
        li.remove(li.size()-1);
    }

    public void peek() {
        li.get(li.size()-1);
    }

    public void display() {
        System.out.println("Elements of the list are:");
        Iterator itr = li.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String args[]) {
        GenericStack<Integer> g = new GenericStack<>();
        g.push(3);
        g.push(5);
        g.push(7);
        g.display();
        g.pop();
        g.push(8);
        g.push(9);
        g.display();
        GenericStack<String> g1 = new GenericStack<>();
        g1.push("preethi");
        g1.push("ihteerp");
        g1.display();
        g1.pop();
        g1.display();
    }
}