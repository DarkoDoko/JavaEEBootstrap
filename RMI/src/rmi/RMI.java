package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RMI {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        Hello hello = (Hello) Naming.lookup("rmi://localhost:8020/hello");
        System.out.println("Hello: " + hello.getClass().getName());
        System.out.println(hello.hello("duke"));
    }
}
