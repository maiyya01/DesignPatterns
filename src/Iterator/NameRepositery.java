package Iterator;

public class NameRepositery
{
    private String[] names = { "Addam", "Joe", "Mahesh"};

    public Iterator getIterator()
    {
        return new NameIterator(names);
    }

}
