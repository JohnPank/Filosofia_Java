package com.john_pank.chapter12.task6;

/**
 * Filosofia_Java
 * Created by John Pank on 05.08.2016.
 */
class MyException1 extends Exception{
    String message;

    MyException1(){
        message = "MyException1, default message";
    }

    MyException1(String msg){
        message = msg;
    }

    public String getMessage(){
        return message;
    }
}

class MyException2 extends Exception{
    String message;
    int errCode;

    MyException2(){
        message = "MyException2, default message";
        errCode = -1;
    }

    MyException2(String msg, int ec){
        message = msg;
        errCode = ec;
    }

    public String getMessage(){
        return message;
    }

    public int getErrCode(){
        return errCode;
    }

}

public class MyExceptionShower{
    public void eg1() throws MyException1{
        //default constructor
        throw new MyException1("ex1");
    }

    public void eg2() throws MyException2{
        //default constructor
        throw new MyException2();
    }

    public static void main(String[] args){
        MyExceptionShower meshower = new MyExceptionShower();

        try{
            meshower.eg1();
        }
        catch(MyException1 me){
            System.out.println(me.getMessage());
        }

        try{
            meshower.eg2();
        }
        catch(MyException2 me){
            System.out.println(me.getMessage() + " Error Code" + me.getErrCode());
        }
    }
}
