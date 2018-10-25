import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class main   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tabNav = {"Grincheux","Simplet","Atchoum","joyaux"};
		float tabPosition[][] = { {0,1,2,3},{41,85,58,75,357,55} };

Navigateur d = new Navigateur(tabNav[1]);//on crée le navigateur
d.ajouterPosition(tabPosition[0][0],tabPosition[0][1]);//on ajoute une position
System.out.println(d.toString()+"\n");	//on affiche la liste des position


char reponse = ' '; 
do {
      System.out.println("Veuillez entrez le nom du navigateur : ");
	   String nav;
	   Scanner sc1 = new Scanner (System.in);
	     nav= sc1.nextLine();
	     if(nav == tabNav[0] || nav == tabNav[1] || nav == tabNav[2] || nav == tabNav[3] )
	     {
	
	try{
		InputStream flux=new FileInputStream("C:/Users/dktzoo/eclipse-workspace/Courjava/src/fichier.csv"); 
		InputStreamReader lecture=new InputStreamReader(flux);
		BufferedReader buff=new BufferedReader(lecture);
		String ligne;
		while ((ligne=buff.readLine())!=null){
			System.out.println(ligne);
		}
		buff.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());	
		}
	
	     }
	     else
	    	 System.out.println("Navigateur introuvable");
	    	 
	// on demande a l'utilisateur si il veut recherchez un navigateur .
	  do{
		    System.out.println("Voulez-vous recherchez un navigateur ? (O/N)");
		    Scanner sc = new Scanner (System.in);
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'N' && reponse != 'O');      
		}while (reponse == 'O');

      System.out.println("Au revoir !");

}

	

}
