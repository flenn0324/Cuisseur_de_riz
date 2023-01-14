import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Demarez le cuiseur O/N ?");
		Scanner sc = new Scanner(System.in);
    	String rep = sc.next();
    	if(rep == "N")
    	{
    		System.out.println("Cuiseur toujour eteint");
    	}
    	else
    	{
    		Cuiseur c = new Cuiseur();
    		System.out.println("Demarage de cuiseur...");
    		System.out.println(/**********************************************************/);
    		Thread.sleep(3000);
    		System.out.println("Cuiseur Demaré ! ");
    		System.out.println(/**********************************************************/);
    		Thread.sleep(3000);
    		System.out.println("verification si la marmite est en place ....");
    		int repm = c.marmite;
    		Thread.sleep(4000);
    		if(repm==0)
    		{
    			System.out.println("Votre Marmite n'est pas en place , veuillez la replacer");
    			Thread.sleep(8000);
    			System.out.println("Marmite en place : validé ! ");
    			Thread.sleep(2000);
    		}
    		else
    		{
    			System.out.println("Marmite en place : validé ! ");
    			System.out.println(/**********************************************************/);
    			System.out.println(/**********************************************************/);
    			System.out.println(/**********************************************************/);
    			Thread.sleep(2000);
    		}
    		System.out.println("Veuillez choisir votre mode de cuison : ");
    		Thread.sleep(1000);
    		System.out.println("1 - mode de cuison rapide ");
    		Thread.sleep(1000);
    		System.out.println("2 - mode de cuison moyen ");
    		Thread.sleep(1000);
    		System.out.println("3 - mode de cuison long ");
    		Thread.sleep(2000);
    		System.out.println(/**********************************************************/);
    		System.out.print("mode choisi : ");
    		Scanner sc1 = new Scanner(System.in);
        	int repmode = sc1.nextInt();
        	c.mode(repmode);
       		System.out.println("\n");
       		System.out.println("\n");
       		System.out.println(/**********************************************************/);
       		System.out.println(/**********************************************************/);
        	Thread.sleep(4000);
        	System.out.println("veuillez vous prendre votre riz ou le gardez à chaud ? 1 : prendre / 0 : garder");
        	System.out.println("/**********************Attention**************************/");
        	System.out.println("Il faut consommer le riz rapidement ou le garder dans une base temperature");
        	System.out.println("Sinon vous risquez d'avoir une intoxiquation alimentaire");
        	System.out.println(/**********************************************************/);
        	System.out.print("votre rep :");
        	Scanner sc2 = new Scanner(System.in);
        	int repch = sc2.nextInt();
        	if(repch==1)
        	{
        		Thread.sleep(2000);
        		System.out.println("/********BON APPETIT********/");
        	}
        	else
        	{
        		System.out.println("le riz peut rester chaud au maximaum 3 houres");
        		Thread.sleep(2000);
        		System.out.println("/*****Conservation du riz au chaud*****/");
        		Thread.sleep(3000);
        		System.out.println("vous pouvez Arreter ce processe à n'importe quel moment en tapant '1' : ");
        		Scanner sc3 = new Scanner(System.in);
            	int repp = sc3.nextInt();
            	if(repp==1)
            	{
            		Thread.sleep(2000);
            		System.out.println("chauffement arreter");
            		Thread.sleep(2000);
            		System.out.println("Vous pouvez prendre votre Riz");
            		Thread.sleep(2000);
            		System.out.println("/********BON APPETIT********/");
            	}
            }
        	
        	}
        	

    	}

	}


