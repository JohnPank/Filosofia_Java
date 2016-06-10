package com.john_pank.chapter6.task5;

/**
 * Filosofia_Java
 * Created by John Pank on 16.02.2016.
 */
class MultiAcsessClass {
    public  int publI;
    int i;
    protected int protI;
    private int privI;

    public void openMethod()
    {
        System.out.println("Open method");
    }

    void packMethod()
    {
        System.out.println("Package method");
    }

    protected void protMethod()
    {
        System.out.println("Protected method");
    }

    private void privMethod()
    {
        System.out.println("Private method");
    }

    public void setPrivI(int i)
    {
        privI = i;
    }

}


class PrivateModifikator
{
    public static void main(String[] args) {
        MultiAcsessClass maclass = new MultiAcsessClass();
        maclass.protI = 10;
        System.out.println(maclass.protI);

    }
}
