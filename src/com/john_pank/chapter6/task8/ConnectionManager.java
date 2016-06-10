package com.john_pank.chapter6.task8;

/**
 * Filosofia_Java
 * Created by John Pank on 17.02.2016.
 */
public class ConnectionManager {
    public static void main(String[] args) {
        Connection connection1 = Connection.makeConnection();
        connection1.showConnectionQuantity();
        Connection connection2 = Connection.makeConnection();
        connection1.showConnectionQuantity();
        Connection connection3 = Connection.makeConnection();
        connection1.showConnectionQuantity();
        Connection connection4 = Connection.makeConnection();
        connection1.showConnectionQuantity();
        connection4.disconnect(connection4);
        Connection connection5 = Connection.makeConnection();
        connection1.showConnectionQuantity();
        Connection connection6 = Connection.makeConnection();
        connection1.showConnectionQuantity();

    }

}
