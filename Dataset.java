import java.util.*;

public class Dataset<T> {
    public static Set<Object> getConjuntoA() {
        return new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 11,13,15,17,19));
    }

    public static Set<Object> getConjuntoB() {
        return new HashSet<>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
    }

    public static Set<Object> getConjuntoC() {
        return new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, "E", "F", "G"));
    }

    public static Set<Object> getConjuntoD() {
        return new HashSet<>(Arrays.asList(7, 8, 9, 10, 11, "G", "H", "I"));
    }

    public static Set<Object> getConjuntoF() {
        return new HashSet<>(Arrays.asList(9, 10, 11, 12, 13, "I", "J", "K"));
    }

    public static Set<Object> getConjuntoG() {
        return new HashSet<>(Arrays.asList(11, 12, 13, 14, 15, "K", "L", "M"));
    }
}

