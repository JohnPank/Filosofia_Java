package com.john_pank.chapter10.task21;

/**
 * Filosofia_Java
 * Created by John Pank on 04.06.2016.
 */
interface Calc {
    void sum(int a, int b);

    void raz(int a, int b);

    class CalcTest {
        public static void test(int a, int b) {

        }
    }
}
    public class CalcReal implements Calc {
        public void sum(int a, int b) {
            System.out.println("summa=" + (a + b));
        }

        public void raz(int a, int b) {
            System.out.println("raznost'=" + (a - b));
        }

        public static void main(String[] args) {
            CalcReal cr = new CalcReal();
            cr.sum(4, 5);
            cr.raz(5, 8);
        }

    }
