import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Object> setA = Dataset.getConjuntoA();
        Set<Object> setB = Dataset.getConjuntoB();
        Set<Object> setC = Dataset.getConjuntoC();
        Set<Object> setD = Dataset.getConjuntoD();
        Set<Object> setF = Dataset.getConjuntoF();
        Set<Object> setG = Dataset.getConjuntoG();

        System.out.println("Conjunto A: " + setA);
        System.out.println("Conjunto B: " + setB);
        System.out.println("Conjunto C: " + setC);
        System.out.println("Conjunto D: " + setD);
        System.out.println("Conjunto F: " + setF);
        System.out.println("Conjunto G: " + setG);

        Set<Object> resultado1 = OperacionesConjuntos.realizarOperacion(setA, "interseccion", setB);
        System.out.println("A ∩ C: " + resultado1);
        
        /*Set<Object> resultado2 = OperacionesConjuntos.realizarOperacion(setB, "diferencia", setC);
        System.out.println("B - C: " + resultado2);
        */

        Set<Object> resultado3 = OperacionesConjuntos.realizarOperacion(setA, "union", setB);
        System.out.println("E ∪ C: " + resultado3);

        /*Set<Object> resultado4 = OperacionesConjuntos.realizarOperacion(resultado2, "union", resultado3);
        System.out.println("(B - C) ∪ (E ∪ C): " + resultado4);*/


    }
}