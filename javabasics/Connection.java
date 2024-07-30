package javabasics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Connection {
    public void getConnection() throws IOException
    {
        throw new IOException();
    }
    public static void main(String args[]) throws FileNotFoundException {
        Connection connection=new Connection();
        try {
            connection.getConnection();
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }
}
