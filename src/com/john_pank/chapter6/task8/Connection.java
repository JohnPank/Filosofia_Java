package com.john_pank.chapter6.task8;

/**
 * Filosofia_Java
 * Created by John Pank on 17.02.2016.
 */
class Connection {

    final static int MAX_CONNECTION_QUANTITY = 5;
    private static int connectionQuantity = 0;

    private Connection()
    {
        connectionQuantity++;
    }

    public static Connection makeConnection()
    {
        if (connectionQuantity<MAX_CONNECTION_QUANTITY)
            return new Connection();

        return null;
    }

    public void disconnect(Connection connection)
    {

        if (connectionQuantity > 0)
        {
            connectionQuantity--;
            connection = null;
        }
    }

    public void showConnectionQuantity()
    {
        System.out.println(connectionQuantity);
    }
}
