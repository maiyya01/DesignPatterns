package Iterator;

public class App
{
    public static void main(String[] args)
    {
        NameRepositery nameRepositery = new NameRepositery();

        for ( Iterator iter = nameRepositery.getIterator(); iter.hasNext();)
        {
            String name = (String) iter.next();
            System.out.println(name);

        }

    }
}
