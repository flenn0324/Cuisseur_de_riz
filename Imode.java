import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Imode extends Remote {

	Void moderapid() throws RemoteException, Exception;
	Void modemoyen() throws RemoteException, Exception;
	Void modelong() throws RemoteException, Exception;

}
