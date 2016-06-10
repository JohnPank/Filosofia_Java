package com.john_pank.chapter4.task24;

/**
 * Filosofia_Java
 * Created by John Pank on 08.02.2016.
 */
public class DigitalVampire {

    public static void main(String[] args) {

        int num = 0;
        //перебор всех вариантов
        for (int a = 0;a<10;a++)
        {
            for (int b = 0;b<10;b++)
            {
                for (int c = 0;c<10;c++)
                {
                    for (int d = 0;d<10;d++)
                    {
                        num = a*1000 + b*100 + c*10 + d;
                        if (num<1000)
                            continue;

                        //a

                        if (num == (a*10+b)*(c*10+d))
                            System.out.println(num + "=" + a + b + "*" + c + d);

                        if (num == (a*10+b)*(d*10+c))
                            System.out.println(num + "=" + a + b + "*" + d + c);

                        if (num == (a*10+d)*(b*10+c))
                            System.out.println(num + "=" + a + d + "*" + b + c);

                        if (num == (a*10+d)*(c*10+b))
                            System.out.println(num + "=" + a + d + "*" + c + b);

                        if (num == (a*10+c)*(b*10+d))
                            System.out.println(num + "=" + a + c + "*" + b + d);

                        if (num == (a*10+c)*(d*10+b))
                            System.out.println(num + "=" + a + c + "*" + d + b);

                        //b

                        if (num == (b*10+a)*(c*10+d))
                            System.out.println(num + "=" + b + a + "*" + c + d);

                        if (num == (b*10+a)*(d*10+c))
                            System.out.println(num + "=" + b + a + "*" + d + c);

                        if (num == (b*10+c)*(a*10+d))
                            System.out.println(num + "=" + b + c + "*" + a + d);

                        if (num == (b*10+c)*(d*10+a))
                            System.out.println(num + "=" + b + c + "*" + d + a);

                        if (num == (b*10+d)*(c*10+a))
                            System.out.println(num + "=" + b + d + "*" + c + a);

                        if (num == (b*10+d)*(a*10+c))
                            System.out.println(num + "=" + b + d + "*" + a + c);

                        //c

                        if (num == (c*10+a)*(b*10+d))
                            System.out.println(num + "=" + c + a + "*" + b + d);

                        if (num == (c*10+a)*(d*10+b))
                            System.out.println(num + "=" + c + a + "*" + d + b);

                        if (num == (c*10+b)*(a*10+d))
                            System.out.println(num + "=" + c + b + "*" + a + d);

                        if (num == (c*10+b)*(d*10+a))
                            System.out.println(num + "=" + c + b + "*" + d + a);

                        if (num == (c*10+d)*(a*10+b))
                            System.out.println(num + "=" + c + d + "*" + a + b);

                        if (num == (c*10+d)*(b*10+a))
                            System.out.println(num + "=" + c + d + "*" + b + a);

                        //d

                        if (num == (d*10+a)*(b*10+c))
                            System.out.println(num + "=" + d + a + "*" + b+ c);

                        if (num == (d*10+a)*(c*10+b))
                            System.out.println(num + "=" + d + a + "*" + c + b);

                        if (num == (d*10+b)*(a*10+c))
                            System.out.println(num + "=" + d + b + "*" + a + c);

                        if (num == (d*10+b)*(c*10+a))
                            System.out.println(num + "=" + d + b + "*" + c + a);

                        if (num == (d*10+c)*(b*10+a))
                            System.out.println(num + "=" + d + c + "*" + b + a);

                        if (num == (d*10+c)*(a*10+b))
                            System.out.println(num + "=" + d + c + "*" + a + b);
                    }
                }
            }
        }
    }



}
