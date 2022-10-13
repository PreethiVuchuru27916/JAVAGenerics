class Test<T> {
    private T genericVariable;
    private T[] genericArray;

    public T getGenericVariable() {
        return this.genericVariable;
    }
    
    public void setGenericVariable(T genericVariable) {
        this.genericVariable = genericVariable;
    }

    public void getGenericArray() {
        for(int i = 0; i < genericArray; i++) {

        }
    }
}

public class GenericClass {
    public static void main(String args[]) {
        Test t = new Test();
        int age = 5;
        String name = "preethi";
        t.setGenericVariable(age);
        System.out.println("Generic variable set is "+t.getGenericVariable());
        t.setGenericVariable(name);
        System.out.println("Generic variable set is "+t.getGenericVariable());
    }
}