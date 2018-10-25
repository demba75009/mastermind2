
public class Position {

	
	private float x,y;
	 
	public  Position (float ax , float ay) {
		x = ax ;
		y = ay;
		
	}
	@Override
	public String toString() {
		return "x=" + x + "  y=" + y;
	}
	public static void main(String argv[]) {
		Position p = new Position(4.12f , -8.0f);
		Position p2 = new Position(0.12f , 35.0f);
		System.out.println(p.toString());
		System.out.println(p2.toString());
	}
	
}
