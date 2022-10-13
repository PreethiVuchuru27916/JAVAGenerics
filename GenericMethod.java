public class GenericMethod {
    public static <T> void print(T[] list) {
        for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String args[]) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "USA"};

        GenericMethod.print(integers);
        GenericMethod.print(strings);
    }
}