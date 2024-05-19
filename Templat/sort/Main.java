import java.util.List;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Sorter sorter = new Sorter();
      sorter.setSortingStrategy(new BubbleSortStrategy());
      sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
      sorter.setSortingStrategy(new InsertionSortStrategy());
      sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
      sorter.setSortingStrategy(new MergeSortStrategy());
      sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
      sorter.setSortingStrategy(new QuickSortStrategy());
      sorter.ordenar(List.of(3, 1, 4, 1, 5, 9, 2, 6));
   }
}