package behavioral.strategy.simple;

public class Main {
    /*
        Стратегия - Определяет семейстов алгоритмов,
        инкапсулируя их все и позволяя подставлять один вместо другого.
        Можно менять алгоритм независимо от клиента, который им пользуется.
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2, 3, 6, 2};
        ArraySorter sorter = new ArraySorter(new BubbleSort());
        sorter.sort(arr);
        sorter.setSortingStrategy(new MergeSort());
        sorter.sort(arr);
    }
}
