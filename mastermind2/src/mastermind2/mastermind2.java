package mastermind2;
import java.util.Scanner;

public class mastermind2 {
	public static void play(){
		
		  
		  int g[]= {4,2,6,8};
			int tab [] = new int [4];
			int count;
			int i = 1;
			
		  System.out.println ("-----Bienvenu dans mastermind------ :" );
			System.out.println ("code: " +g[0] +g[1] +g[2] +g[3]  );
			for ( count = 0 ; count < 4 ; count ++ ) {
				System.out.println ("Veuillez entrez le  "+i+" chiffre du code :"  );

			Scanner sc = new Scanner (System.in);
			tab[count] = sc.nextInt();
			i++;
	    
	    }

	if(tab[0] == g[0] && tab[1] == g[1] && tab[2] == g[2] && tab[3] == g[3])

	System.out.println ("bravo !");

		


	else {


	for(int y=8;y>0;y--) {
	System.out.println ("\t");
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
	System.out.println(  " \nincorrect nombre de tentative: "  + y  );
	i = 1;
	for ( count = 0 ; count < 4 ; count ++ ) {
	System.out.print("\nVeuillez entrez le  " +i+ " chiffre du code :");

	Scanner sc = new Scanner (System.in);
	tab[count] = sc.nextInt();
	i++;
	}
	if(tab[0] == g[0] && tab[1] == g[1] && tab[2] == g[2] && tab[3] == g[3]){

		System.out.println("");  
	return;

	}
		
	System.out.println("perdu! vous avez epuiser le nombre de tentatives");  
	
	}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 
			  
			 

	}
}
