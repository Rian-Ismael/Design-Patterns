import java.util.List;

class Sorter {
   private SortingStrategy sortingStrategy;

   Sorter() {
   }

   public void setSortingStrategy(SortingStrategy sortingStrategy) {
      this.sortingStrategy = sortingStrategy;
   }

   public void ordenar(List<Integer> elementos) {
      if (this.sortingStrategy == null) {
         System.out.println("Nenhuma estrat\u00e9gia de ordena\u00e7\u00e3o definida.");
      } else {
         this.sortingStrategy.sort(elementos);
      }
   }
}