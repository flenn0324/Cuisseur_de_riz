import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cuiseur {
	
	public int marmite;

	public Cuiseur() {
		super();
	}
	
	public int marmite()
	{
		int n = (int) Math.random();
		return n;
	}
	
	public void mode(int m) throws Exception
	{
		switch(m){
		   
	       case 1: 
	           System.out.println("Mode Rapide choisi :) ");
	           Thread.sleep(1000);
	           System.out.println("debut du trampage de riz");
	           Thread.sleep(1000);
	           System.out.println("vous devez attendre 1h pour la fin du trempage et 25min pour le cuison");
	           Thread.sleep(8000);
	           System.out.println("n'eteignez pas le cuiseur avant la fin du cuison s.v.p");
	           Thread.sleep(8000);
	            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
				Imode i = (Imode)reg.lookup("refp3");
				i.moderapid();
	           
	           System.out.println("operation terminer !");
	           break;
	   
	       case 2:
	    	   System.out.println("Mode Moyen choisi :) ");
	           Thread.sleep(1000);
	           System.out.println("debut du trampage de riz");
	           Thread.sleep(2000);
	           System.out.println("vous devez attendre 1h pour la fin du trempage et 35min pour le cuison");
	           Thread.sleep(5000);
	           System.out.println("n'eteignez pas le cuiseur avant la fin du cuison s.v.p");
	           Thread.sleep(8000);
	            Registry reg1 = LocateRegistry.getRegistry("127.0.0.1",1099);
				Imode i1 = (Imode)reg1.lookup("refp3");
				i1.moderapid();
				System.out.println("/**********************************************************/");
				System.out.println("/**********************************************************/");
	       		System.out.println("/**********************************************************/");
	           System.out.println("/****************operation terminer !******************/");
	       		System.out.println("/**********************************************************/");
	       		System.out.println("/**********************************************************/");
	       		System.out.println("/**********************************************************/");
	           break;
	   
	       case 3:
	    	   System.out.println("Mode Long choisi :) ");
	           Thread.sleep(1000);
	           System.out.println("debut du trampage de riz");
	           Thread.sleep(1000);
	           System.out.println("vous devez attendre 1h pour la fin du trempage et 45min pour le cuison");
	           Thread.sleep(5000);
	           System.out.println("n'eteignez pas le cuiseur avant la fin du cuison s.v.p");
	           Thread.sleep(8000);
	            Registry reg2 = LocateRegistry.getRegistry("127.0.0.1",1099);
				Imode i2 = (Imode)reg2.lookup("refp3");
				i2.moderapid();
				System.out.println(/**********************************************************/);
				System.out.println(/**********************************************************/);
	           System.out.println("operation terminer !");
	           break;
	       default:
	           System.out.println("Choix incorrect, veuillez choisir parmi les modes disponibles s.v.p");
	           System.out.print("mode choisi : ");
	    	   Scanner sc1 = new Scanner(System.in);
	           int repmode = sc1.nextInt();
	           this.mode(repmode);
	           break;
	   }
		
	}
	

	
	
	

}
