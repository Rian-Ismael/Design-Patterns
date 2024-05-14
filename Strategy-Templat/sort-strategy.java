import java.util.List;

// Interface para as estratégias de ordenação
interface SortingStrategy {
    void sort(List<Integer> elements);
}

// Estratégia de ordenação usando Bubble Sort
class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> elements) {
        System.out.println("Ordenando usando Bubble Sort");
    }
}

// Estratégia de ordenação usando Insertion Sort
class InsertionSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> elements) {
        System.out.println("Ordenando usando Insertion Sort");
    }
}

// Estratégia de ordenação usando Merge Sort
class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> elements) {
        System.out.println("Ordenando usando Merge Sort");
    }
}

// Estratégia de ordenação usando Quick Sort
class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> elements) {
        System.out.println("Ordenando usando Quick Sort");
    }
}

// Classe cliente (Contexto)
class Sorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void ordenar(List<Integer> elementos) {
        if (sortingStrategy == null) {
            System.out.println("Nenhuma estratégia de ordenação definida.");
            return;
        }
        sortingStrategy.sort(elementos);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Sorter sorter = new Sorter();
//
//        // Usando Bubble Sort
//        sorter.setSortingStrategy(new BubbleSortStrategy());
//        sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
//
//        // Usando Insertion Sort
//        sorter.setSortingStrategy(new InsertionSortStrategy());
//        sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
//
//        // Usando Merge Sort
//        sorter.setSortingStrategy(new MergeSortStrategy());
//        sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
//
//        // Usando Quick Sort
//        sorter.setSortingStrategy(new QuickSortStrategy());
//        sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
//    }
}
