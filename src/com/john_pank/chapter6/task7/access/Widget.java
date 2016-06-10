package com.john_pank.chapter6.task7.access;

/**
 * Filosofia_Java
 * Created by John Pank on 17.02.2016.
 */
public class Widget {

    public Widget(String i)
    {
        WidgetHelper wh = new WidgetHelper();
        wh.help();
        System.out.println(i);
    }
}

