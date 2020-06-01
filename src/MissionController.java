
public class MissionController {
	private Robot robot;
	public void create() {
		this.robot=new Robot(0,0);
	}

	public void step() {
		this.robot.step();
	}

	public void turn() {
		this.robot.turn();
	}

	public void print() {
		robot.print();
		
	}

}
