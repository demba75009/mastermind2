package mastermind2;
import java.util.Scanner;

public class mastermind2 {
	public static void play(){
		//initialisation des variables + du nombre aléatoire
		int max=0,min=9;		
		int nbAlea = (int)(Math.random()*(max-min))+min;
		int nbAlea1 = (int)(Math.random()*(max-min))+min;
		int nbAlea2 = (int)(Math.random()*(max-min))+min;
		int nbAlea3 = (int)(Math.random()*(max-min))+min;
		  int g[]= {nbAlea,nbAlea1,nbAlea2,nbAlea3};
			int tab [] = new int [4];
			int count;
			int i = 1;
			
			
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

	System.out.println ("bravo ! Vous avez trouvez le bon code");

		
// si code faux

	else {


	for(int y=8;y>0;y--) {
	if(tab[0] == g[0])
		System.out.println ("O");
	if(tab[0] == g[1] || tab[0] == g[2] || tab[0] == g[3])
		System.out.println ("P");
	if(tab[0] != g[0] && tab[0] != g[1] && tab[0] != g[2] && tab[0] != g[3])
		System.out.println ("X");
		
	if(tab[1] == g[1])
		System.out.println ("O");
	if(tab[1] == g[0] || tab[1] == g[2] || tab[1] == g[3])
		System.out.println ("P");
	if(tab[1] != g[1] && tab[1] != g[0] && tab[1] != g[2] && tab[1] != g[3])
		System.out.println ("X");

	if(tab[2] == g[2])
		System.out.println ("O");
	if(tab[2] == g[0] || tab[2] == g[1] || tab[2] == g[3])
		System.out.println ("P");
	if(tab[2] != g[2] && tab[2] != g[0] && tab[2] != g[1] && tab[2] != g[3])
		System.out.println ("X");

	if(tab[3] == g[3])
		System.out.println ("O");
	if(tab[3] == g[0] || tab[3] == g[1] || tab[3] == g[2])
		System.out.println ("P");
	if(tab[3] != g[3] && tab[3] != g[0] && tab[3] != g[1] && tab[3] != g[2])
		System.out.println ("X");

	System.out.println ("\t\t\tLegende: 0 = nombre Bien place. X = nombre incorrecte. P = nombre Mal placer");

	Scanner sc1 = new Scanner(System.in);
	System.out.println("\nincorrect nombre de tentative: "  + y  );
	i = 1;
	
	//recommence le jeu jusqu'a que le nombre de tentatives écoulées
	for ( count = 0 ; count < 4 ; count ++ ) {
	System.out.print("Veuillez entrez le  " +i+ " chiffre du code :");

	Scanner sc = new Scanner (System.in);
	tab[count] = sc.nextInt();
	i++;
	}
	if(tab[0] == g[0] && tab[1] == g[1] && tab[2] == g[2] && tab[3] == g[3]){

		System.out.println ("bravo ! Vous avez trouvez le bon code:"+g[0]+g[1]+g[2]+g[3]);
	return;

	}
		//si le joueur perd la partie et on affiche le bon code
	
	}
	System.out.println("perdu! vous avez epuiser le nombre de tentatives. le bon code etait:"+g[0]+g[1]+g[2]+g[3]);  

	}
	}
	
}
