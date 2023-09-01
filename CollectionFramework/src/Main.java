import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
                Implementa a interface List.
                Coleção dinâmica que permite elementos duplicados.
                Usada quando você precisa de uma lista redimensionável.
         */
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Item 1");
        lista.add("Item 2");

        /*
                Semelhante ao ArrayList, mas é sincronizado, o que o torna seguro para uso em threads.
                Não é recomendado para novos projetos devido à sua sincronização.
         */
        Vector<Integer> vetor = new Vector<>();
        vetor.add(1);
        vetor.add(2);


        /*
                Subclasse de Vector, representa uma pilha (LIFO - Last-In-First-Out).
                Usada para implementar algoritmos baseados em pilha.
         */
        Stack<String> pilha = new Stack<>();
        pilha.push("Elemento 1");
        pilha.push("Elemento 2");


         /*
               Implementa a interface List e a interface Deque.
               Útil quando você precisa de inserção e remoção eficientes em ambas as extremidades da lista.
         */
        LinkedList<Integer> listaEncadeada = new LinkedList<>();
        listaEncadeada.addFirst(1);
        listaEncadeada.addLast(2);

         /*
               Implementa a interface Set.
               Armazena elementos únicos em ordem não garantida.
         */
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");

    /*
    List (java.util.List):

                   Interface que representa uma coleção ordenada de elementos.
                   Implementações incluem ArrayList, LinkedList, Vector, entre outras.
    Set (java.util.Set):

                   Interface que representa uma coleção não ordenada de elementos únicos.
                   Implementações incluem HashSet, TreeSet, LinkedHashSet, entre outras.
    Collection (java.util.Collection):

                   Interface raiz para todas as coleções.
                   Define operações comuns, como add, remove e size.
    Queue (java.util.Queue):

                   Interface que representa uma fila (por exemplo, FIFO - First-In-First-Out).
                   Implementações incluem LinkedList e PriorityQueue.
    Deque (java.util.Deque):

                   Interface que representa uma deque (double-ended queue).
                   Implementações incluem ArrayDeque e LinkedList.
    SortedSet (java.util.SortedSet):

                   Interface que representa um conjunto ordenado de elementos.
                   Implementações incluem TreeSet.
    TreeSet (java.util.TreeSet):

                   Implementa a interface SortedSet.
                   Armazena elementos únicos em ordem natural ou usando um comparador.
    Map (java.util.Map):

                   Interface que representa uma coleção de pares chave-valor.
                   Implementações incluem HashMap, TreeMap, LinkedHashMap, entre outras.
    TreeMap (java.util.TreeMap):

                   Implementa a interface Map.
                   Armazena pares chave-valor em ordem natural ou usando um comparador.
    */
        // 6. List (java.util.List)
        List<String> lista2 = new ArrayList<>();
        lista2.add("Item 1");
        lista2.add("Item 2");
        System.out.println("List: " + lista);

        // 7. Set (java.util.Set)
        Set<Integer> conjunto3 = new HashSet<>();
        conjunto3.add(1);
        conjunto3.add(2);
        System.out.println("Set: " + conjunto);

        // 8. Collection (java.util.Collection)s
        Collection<String> colecao = new ArrayList<>();
        colecao.add("Elemento 1");
        colecao.add("Elemento 2");
        System.out.println("Collection: " + colecao);

        // 9. Queue (java.util.Queue)
        Queue<String> fila = new LinkedList<>();
        fila.offer("Elemento 1");
        fila.offer("Elemento 2");
        System.out.println("Queue: " + fila);

        // 10. Deque (java.util.Deque)
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println("Deque: " + deque);

        // 11. SortedSet (java.util.SortedSet)
        SortedSet<String> conjuntoOrdenado = new TreeSet<>();
        conjuntoOrdenado.add("C");
        conjuntoOrdenado.add("A");
        conjuntoOrdenado.add("B");
        System.out.println("SortedSet: " + conjuntoOrdenado);

        // 12. TreeSet (java.util.TreeSet)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet: " + treeSet);

        // 13. Map (java.util.Map)
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Chave 1", 100);
        mapa.put("Chave 2", 200);
        System.out.println("Map: " + mapa);

        // 14. TreeMap (java.util.TreeMap)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 300);
        treeMap.put("A", 100);
        treeMap.put("B", 200);
        System.out.println("TreeMap: " + treeMap);

    }
}