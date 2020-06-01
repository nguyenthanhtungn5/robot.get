
public class South extends Richtung {
	private String richtung="South";
	
	public String getRichtung() {
		// TODO Auto-generated method stub
		return richtung;
	}
	@Override
	public Position step(Position position) {
		int y= position.getY()-1;
		return new Position(position.getX(),y);	
		
	}
}
