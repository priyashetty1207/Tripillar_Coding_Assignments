package Module4;

final class Animal
{
    void show()
    {
        System.out.println("Animal class");
    }
}

class TestFinal
{
    public static void main(String args[])
    {
        Animal a = new Animal();
        a.show();
    }
}