package calculadoraRMI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraServer {
	
	public static void main(String[] args) {
		try {
			
			/* Registro criado na própria JVM, use rmiregistry [port] para criar na maquina
			System.out.println("Criando registro");
			LocateRegistry.createRegistry(1099);
			*/
			
			Calculadora calc = new CalculadoraImpl();
			System.out.println("Obtendo registro");
			Registry registry = LocateRegistry.getRegistry(2001);
			System.out.println("Servidor Criado");
			// Bind the remote object's stub in the registry
			registry.rebind("Hello", calc);
			System.out.println("calculadora server ready.");
			System.out.println("Digite <ENTER> para encerrar");
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			// O buffered reader serve apenas para "parar" a execução
			b.read();
		} catch (Exception e) {
			System.out.println("calculadora server main " + e.getMessage());
		}	
	}
}
