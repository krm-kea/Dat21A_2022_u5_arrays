package com.company;

public class MyArray<T>
{
    private Object[] arr;

    private int initialLength = 10;
    private int elements = 0;

    public MyArray()
    {
        arr = new Object[initialLength];
    }

    public int getElements()
    {
        return elements;
    }

    public T get(int index)
    {
        return (T) arr[index];
    }

    public void add(T x)
    {
        if (elements < arr.length)
        {
            arr[elements] = x;
            elements++;
        }
        else
        {
            increaseArrayLength();
            arr[elements] = x;
            elements++;
        }
    }

    public boolean add(int index, T object)
    {
        // tilføj nogen kode her
        // Husk1: Hvad sker der hvis man tilføjer midt i en array?
        // Husk2: Hvad sker der hvis man prøver at tilføje på plads 27 når der kun er 7 elementer i alt?
        // Husk3: Returnere true hvis det gik godt, og returnere false hvis det ikke gik godt.
        return false;
    }

    public void remove(int index)
    {
        // tilføj nogen kode her
        // Husk: Hvad gører du hvis index peger udenfor array elementerne?
    }

    public  void clear()
    {
        // tilføj nogen kode her
    }

    private void increaseArrayLength()
    {
        System.out.println("Ups, I need to increase the length og this myArray object.");
        int length = arr.length;
        Object[] arr2 = new Object[length+10];
        for (int i=0; i<(arr.length); i++)
        {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public String toString()
    {
        // en smule simpel kode, hvor der komme en komma "," for meget
        String str;
        str = "[";
        for (int i=0; i<elements; i++)
        {
            str = str + arr[i];
            str = str + ", ";
        }
        str = str + "]";
        return str;
    }


}
