package com.john_pank.chapter10.task7;

/**
 * Filosofia_Java
 * Created by John Pank on 30.05.2016.
 */
public class CloseClass {
    private String str;
    public CloseClass(String str){
        this.str = str;
    }
    private void getStr(){
        System.out.println(str);
    }

    String getInnerStr(){
        return new Inner().prs;
    }

    Inner createInner(){
        return new Inner();
    }

    class Inner{
        private String prs = "123";
        void changeStr(String ist){
            str = ist;
        }
        void showStr(){getStr();}
    }

    public static void main(String[] args) {
        CloseClass cc = new CloseClass("john");
        System.out.println(cc.getInnerStr());
        Inner in = cc.createInner();
        in.showStr();
        in.changeStr("pank");
        in.showStr();
    }

}
