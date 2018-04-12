package calculadoraRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

	protected CalculadoraImpl() throws RemoteException {
		super();
	}

	public int add(int n1, int n2) throws RemoteException {
		return n1 + n2;
	}

	public int sub(int n1, int n2) throws RemoteException {
		return n1 - n2;
	}

	public int mul(int n1, int n2) throws RemoteException {
		return n1 * n2;
	}

	public int div(int n1, int n2) throws RemoteException {
		return n1 / n2;
	}

}
