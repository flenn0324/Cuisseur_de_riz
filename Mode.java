import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Mode extends java.rmi.server.UnicastRemoteObject implements Imode {
	
	public Mode() throws RemoteException{
		System.out.println("Chrono en cours....");
	}

	public static void main(String[] args) {
        try {
			Mode p3 = new Mode();
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("refp3", p3);
		}
		catch(Exception e)
		{
			System.out.println("ERROR MSG "+ e.getMessage());
		}

	}


	public Void moderapid() throws RemoteException, Exception {
		System.out.println("temps de trempage :");
		for(int i = 30;i>=0;i--)
		{
			System.out.println("Temps rester pour fin trempage : "+ i+"min");
			Thread.sleep(1000);
		}
		System.out.println("/*********************temps de cuison :*******************/");
		int i=25;
		while(i>=0)
		{
			System.out.println("Temps rester pour fin cuison : "+ i+"min");
			Thread.sleep(1000);
			i--;
			if(i==10)
			{
				System.out.println(/**********************************************************/);
				System.out.println("verification de temperateur ...");
				System.out.println(/**********************************************************/);
				Thread.sleep(3000);
				int n = (int) Math.random(); 
				if(n==1)
				{
					System.out.println("temperature = 140 degre");
					Thread.sleep(3000);
					System.out.println("l'operation s'arrete");
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("temperature < 140");
					Thread.sleep(3000);
					System.out.println("l'operation se continue");
					System.out.println(/**********************************************************/);
					Thread.sleep(3000);
				}
			}
		}
		System.out.println("Cuison terminer !");
		return null;
	}


	public Void modemoyen() throws RemoteException, Exception {
		System.out.println("temps de trempage :");
		for(int i = 30;i>=0;i--)
		{
			System.out.println("Temps rester pour fin trempage : "+ i+"min");
			Thread.sleep(1000);
		}
		System.out.println(/**********************************************************/);
		System.out.println("/*************temps de cuison***************/ :");
		
		int i=35;
		while(i>=0)
		{
			System.out.println("Temps rester pour fin cuison : "+ i+"min");
			Thread.sleep(1000);
			i--;
			if(i==10)
			{
				System.out.println(/**********************************************************/);
				System.out.println("verification de temperateur ...");
				System.out.println(/**********************************************************/);
				Thread.sleep(3000);
				int n = (int) Math.random(); 
				if(n==1)
				{
					System.out.println("temperature = 140 degre");
					Thread.sleep(3000);
					System.out.println("l'operation s'arrete");
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("temperature < 140");
					Thread.sleep(3000);
					System.out.println("l'operation se continue");
					System.out.println(/**********************************************************/);
					Thread.sleep(3000);
				}
			}
		}
		System.out.println("Cuison terminer !");
		return null;
	}


	public Void modelong() throws RemoteException, Exception {
		System.out.println("temps de trempage :");
		for(int i = 30;i>=0;i--)
		{
			System.out.println("Temps rester pour fin trempage : "+ i+"min");
			Thread.sleep(1000);
		}
		System.out.println("/***********temps de cuison :************/");
		
		int i=45;
		while(i>=0)
		{
			System.out.println("Temps rester pour fin cuison : "+ i+"min");
			Thread.sleep(1000);
			i--;
			if(i==10)
			{
				System.out.println(/**********************************************************/);
				System.out.println("verification de temperateur ...");
				System.out.println(/**********************************************************/);
				Thread.sleep(3000);
				int n = (int) Math.random(); 
				if(n==1)
				{
					System.out.println("RESULTAT : temperature = 140 degre");
					Thread.sleep(3000);
					System.out.println("l'operation s'arrete");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("temperature < 140");
					Thread.sleep(3000);
					System.out.println("l'operation se continue");
					System.out.println(/**********************************************************/);
					Thread.sleep(3000);
				}
			}
		}
		System.out.println("Cuison terminer !");
		return null;
	}
}