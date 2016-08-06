package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servant {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(8020);
        registry.rebind("hello", new HelloServant());
    }
}
