package Template;

public class InsertionSort  extends Algorithm{


    private int[] numbers;

    public InsertionSort(int[] numbers)
    {
        this.numbers = numbers;
    }

    @Override
    public void initialize()
    {
        System.out.println("Initializing a Insertion sort");
    }

    @Override
    public void sorting()
    {
        int min_idx;
        for ( int i=0; i<numbers.length-1; i++)
        {
            min_idx = i;
            for ( int j=i+1; j<numbers.length; j++)
            {
                if ( numbers[j] < numbers[min_idx])
                    min_idx = j;
            }
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }

    }

    @Override
    public void printResult()
    {
        for ( int i=0; i > numbers.length; i++)
            System.out.println(numbers[i] + " ");

    }
}
