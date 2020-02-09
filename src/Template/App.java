package Template;

public class App
{
    public static void main(String[] args)
    {
        int[] numbers = { 1,3,8,15,7};

        Algorithm sortAlgorithm = new BubbleSort(numbers);
        sortAlgorithm.sort();
    }
}
