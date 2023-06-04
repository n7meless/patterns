package behavioral.strategy.simple;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Реализация сортировки пузырьком");
    }
}
