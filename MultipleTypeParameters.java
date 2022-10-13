interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

public class MultipleTypeParameters<K, V> implements Pair<K,V> {
    private K key;
    private V value;

    public MultipleTypeParameters(K Key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String args[]) {
        Pair<String, Integer> p = new MultipleTypeParameters<String, Integer>("preethi", 1);
        System.out.println(p.getValue());

        // or 

        MultipleTypeParameters<String, Integer> m = new MultipleTypeParameters<String, Integer>("ihteerp", 2);
        System.out.println(m.getValue());
    }
}
