import java.util.*;
public class GenericCopyTwoLists {

    public static <T> void copy(List<? extends T> src, List<? super T> dst) {
        for(int i=0; i < src.size(); i++) {
            dst.add(src.get(i));
        }
        display(dst);
    }

    public static <T> void display(List<? super T> dst){
        System.out.println("Destination array is : ");
        Iterator i = dst.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void main(String args[]) {
        List<Integer> src = new ArrayList<>();
        List<Number> dst = new ArrayList<>();
        src.add(3);
        src.add(4);
        GenericCopyTwoLists.copy(src, dst);
    }
}