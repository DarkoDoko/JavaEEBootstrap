package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServant extends UnicastRemoteObject implements Hello{

    public HelloServant() throws RemoteException {
        super();
    }

    @Override
    public String hello(String msg) throws RemoteException {
        return "Hello client!: " + msg;
    }
}
