import java.util.*;
import java.io.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int[] prova = {1,2,3,5,6};
		int ok=0;
		int dividendo = 0;
		int divisore;
		Rettangolo r=new Rettangolo();
		try
		{
		r.setBase(-7);
		}catch(EccezioneBaseNegativa io) {System.out.println(io);}
		
	
		do {
			ok=0;
			try
			{
				System.out.println("Inserisci dividendo: ");
				dividendo = in.nextInt();
			/*for(int x=0;x<=prova.length;x++)
				System.out.println(prova[x]);
			*/ //ArrayIndexOutOfBoundsException
			}catch(InputMismatchException x)
			{
				System.out.println("Fuori dallo stress");
				in.nextLine();
				ok=1;
			}
		}while(ok==1);
		
		
		do {
			ok=0;
			try
			{
				System.out.println("Inserisci divisore");
				divisore=in.nextInt();
				System.out.println(dividendo/divisore);
				
			/*for(int x=0;x<=prova.length;x++)
				System.out.println(prova[x]);
			*/ //ArrayIndexOutOfBoundsException
			}catch(InputMismatchException x)
			{
				System.out.println("Fuori dallo stress");
				in.nextLine();
				ok=1;
			}
			catch(ArithmeticException x)
			{
				in.nextLine();
				System.out.println("Non si può divididere per 0");
				ok=1;
			}
		}while(ok==1);
		
		System.out.println("ciao");
		
	}

}
