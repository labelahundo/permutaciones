import java.util.HashSet;
import java.util.Set;

public class OperacionesConjuntos {
    public static Set<Object> union(Set<Object> conjunto1, Set<Object> conjunto2) {
        Set<Object> resultado = new HashSet<>(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }

    public static Set<Object> interseccion(Set<Object> conjunto1, Set<Object> conjunto2) {
        Set<Object> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2);
        return resultado;
    }

    public static Set<Object> diferencia(Set<Object> conjunto1, Set<Object> conjunto2) {
        Set<Object> resultado = new HashSet<>(conjunto1);
        resultado.removeAll(conjunto2);
        return resultado;
    }

    public static Set<Object> realizarOperacion(Set<Object> conjuntoA, String operacion, Set<Object> conjuntoB) {
        Set<Object> resultado = new HashSet<>();

        switch (operacion) {
            case "union":
                resultado = union(conjuntoA, conjuntoB);
                break;
            case "interseccion":
                resultado = interseccion(conjuntoA, conjuntoB);
                break;
            case "diferencia":
                resultado = diferencia(conjuntoA, conjuntoB);
                break;

            default:
                System.out.println("Operación no reconocida.");
        }

        return resultado;
    }
}
