package mastermind2;
import java.util.Scanner;

public class mastermind2 {
	public static void play(){
		//initialisation des variables + on genere un  nombre aléatoire
		int max=0,min=9;		
		int nbAlea = (int)(Math.random()*(max-min))+min;
		int nbAlea1 = (int)(Math.random()*(max-min))+min;
		int nbAlea2 = (int)(Math.random()*(max-min))+min;
		int nbAlea3 = (int)(Math.random()*(max-min))+min;
		int g[]= {nbAlea,nbAlea1,nbAlea2,nbAlea3};
		int tab [] = new int [4];
		int count;
		int i = 1;
			
			
				
			//début du jeu
					  System.out.println ("-----Bienvenu dans mastermind------ :" );
		  
		 //saisie du code de l'utilisateur
			for ( count = 0 ; count < 4 ; count ++ ) {
				 System.out.println ("\nVeuillez entrez le  "+i+" chiffre du code :"  );

			     Scanner sc = new Scanner (System.in);
			     tab[count] = sc.nextInt();
			i++;
	    
	    }
			
			//Comparaison puis affichage du résultat du code
		  
	//si code bon
	if(tab[0] == g[0] && tab[1] == g[1] && tab[2] == g[2] && tab[3] == g[3])
	{
	System.out.println ("bravo ! Vous avez trouvez le bon code");
		
			}
	
// si code faux

	else {


	for(int y=8;y>0;y--) {
		//on verife les chiffre du  code 1 par 1
		
	if(tab[0] == g[0])
		System.out.println ("chiffre 1 : O");
	if(tab[0] == g[1] || tab[0] == g[2] || tab[0] == g[3])
		System.out.println ("chiffre 1 : P");
	if(tab[0] != g[0] && tab[0] != g[1] && tab[0] != g[2] && tab[0] != g[3])
		System.out.println ("chiffre 1 : X");
		
	if(tab[1] == g[1])
		System.out.println ("chiffre 2 :\tO");
	if(tab[1] == g[0] || tab[1] == g[2] || tab[1] == g[3])
		System.out.println ("chiffre 2 :\tP");
	if(tab[1] != g[1] && tab[1] != g[0] && tab[1] != g[2] && tab[1] != g[3])
		System.out.println ("chiffre 2 :\tX");

	if(tab[2] == g[2])
		System.out.println ("chiffre 3 :\t\tO");
	if(tab[2] == g[0] || tab[2] == g[1] || tab[2] == g[3])
		System.out.println ("chiffre 3 :\t\tP");
	if(tab[2] != g[2] && tab[2] != g[0] && tab[2] != g[1] && tab[2] != g[3])
		System.out.println ("chiffre 3 :\t\tX");

	if(tab[3] == g[3])
		System.out.println ("chiffre 4 :\t\t\tO");
	if(tab[3] == g[0] || tab[3] == g[1] || tab[3] == g[2])
		System.out.println ("chiffre 4 :\t\t\tP");
	if(tab[3] != g[3] && tab[3] != g[0] && tab[3] != g[1] && tab[3] != g[2])
		System.out.println ("chiffre 4 :\t\t\tX");

	System.out.println ("\t\t\t\t\t\tLegende: 0 = chiffre Bien place. X = chiffre incorrecte. P = chiffre Mal placé/chiffre placé a plusieurs endroits");

	Scanner sc1 = new Scanner(System.in);
	System.out.println("\nincorrect nombre de tentative: "  + y  );
	i = 1;
	
	//on recommence le jeu jusqu'a que le nombre de tentatives soit écoulés
	for ( count = 0 ; count < 4 ; count ++ ) {
	System.out.print("Veuillez entrez le  " +i+ " chiffre du code :");

	Scanner sc = new Scanner (System.in);
	tab[count] = sc.nextInt();
	i++;
	}
	//si le code est bon
	if(tab[0] == g[0] && tab[1] == g[1] && tab[2] == g[2] && tab[3] == g[3]){

		System.out.println ("bravo ! Vous avez trouvez le bon code:"+g[0]+g[1]+g[2]+g[3]);
		
	return;

	}
		// le joueur perd la partie et on affiche le bon code
	
	}
	System.out.println("perdu! vous avez epuiser le nombre de tentatives. \nle bon code etait:"+g[0]+g[1]+g[2]+g[3]);  

	}
	
	
		                
		
	}
	
}
