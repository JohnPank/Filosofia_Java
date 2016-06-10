package com.john_pank.chapter5.task21;

/**
 * Filosofia_Java
 * Created by John Pank on 13.02.2016.
 */
public class MoneyEnum {
    public enum Money
    {
        CHIRIC, POLTOS, SOTEN, PYATIHAT, KOSAR, PYAT_COSAREY
    }

    public static void main(String[] args) {
        Money bablo;
        for (Money denga : Money.values())
        {
            //System.out.println(denga + " " + denga.ordinal());

            switch (denga)
            {
                case CHIRIC:
                    System.out.println(10);
                    break;
                case POLTOS:
                    System.out.println(50);
                    break;
                case SOTEN:
                    System.out.println(100);
                    break;
                case PYATIHAT:
                    System.out.println(500);
                    break;
                case KOSAR:
                    System.out.println(1000);
                    break;
                case PYAT_COSAREY:
                    System.out.println(5000);
                    break;
            }


        }

    }
}
