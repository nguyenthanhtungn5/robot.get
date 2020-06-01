
public class main {
	public static void main (String[] args) {
		MissionController missioncontroller = new MissionController ();
		missioncontroller.create();
		missioncontroller.step();
		missioncontroller.turn();
		missioncontroller.step();
		missioncontroller.turn();
		missioncontroller.step();
		missioncontroller.print();
	}
}
