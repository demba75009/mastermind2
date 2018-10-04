package mastermind2;

import java.util.Scanner;


public class main extends mastermind2 {


	public static void main(String[] args)
	  {
		char reponse = ' '; 
do {
	// on lance le jeu
		play();
		
		
		// on demande a l'utilisateur si il veut rejouer .
		  do{
			    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
			    Scanner sc = new Scanner (System.in);
			    reponse = sc.nextLine().charAt(0);
			  }while(reponse != 'N' && reponse != 'O');      
			}while (reponse == 'O');

            System.out.println("Au revoir !");

	  }
	 
	
	  }
