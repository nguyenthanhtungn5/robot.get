
public class Robot {
	private Position position;
	private Richtung[] richtung= {new North(),new East(),new South(),new West()};
	private int index;
	public Robot(int x,int y) {
		this.position=new Position(x,y);
		this.index=0;
	}
	public void turn() {
		this.index=(index+1)%4;
	}
	public void step() {
		this.position=richtung[index].step(position);
		
	}
	public Position getPosition() {
		return this.position;
		
	}
	public Richtung getRichtung() {
		return richtung[index];
	}
	public void print() {
		System.out.print(position.getX()+" "+ position.getY());		
		System.out.print("Richtung : " + richtung[index].getRichtung());

		
	}
}
