package com.company;

import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        Random randGen = new Random();
        MyArray<String> myArr = new MyArray<>();
        System.out.println(myArr);

        for (int i=0; i<24; i++)
        {
            myArr.add("Danmark" + i);
            // Next line just for debug/demo purpose
            System.out.println(myArr.get(i));
        }

        for (int i=0; i< myArr.getElements(); i++)
        {
        }

        System.out.println(myArr);

    }//end main

}
