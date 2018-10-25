import java.util.ArrayList;

public class Navigateur  {
	String nom;
	ArrayList<Position> liste;
	float []ListePosition;
	// on crée un constructeur qui initialise le Navigateur
	public Navigateur(String name)
	{
		init(name);
		
	}
	
	
	public  void init(String name)
	{
		
	nom = name;
	liste = new ArrayList<Position>();
	System.out.println(nom);
	}
	
	public   void ajouterPosition(float x, float y)
	{
		
		Position p = new Position(x , y);
		liste.add(p); // on ajoute la position
		System.out.println("Position ajoutée : "+p.toString());

		
	}
	//surchage de string pour retournez la liste des positions
	@Override
	public String toString() {
		return "list =" +liste.toString();
	}
	
	}
