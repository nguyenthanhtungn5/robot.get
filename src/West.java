
public class West extends Richtung {
	private String richtung="West";
	
	public String getRichtung() {
		// TODO Auto-generated method stub
		return richtung;
	}
	@Override
	public Position step(Position position) {
		int x= position.getX()-1;
		return new Position(x,position.getY());	
		
	}
}
