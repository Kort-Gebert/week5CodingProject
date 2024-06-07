package week5CodingProject;

public class Week5CodingProject {

	public static void main(String[] args) {
		AsteriskLogger asLog = new AsteriskLogger();
		SpacedLogger spLog = new SpacedLogger();
		asLog.log("Hello");
		asLog.error("Hello");
		spLog.log("Hello");
		spLog.error("Hello");
		
		//Testing Inputs:
		
		//AsteriskLogger:
		asLog.log("Hippopotamus");
		asLog.error("Hippopotamus");
		asLog.log("Lauwiliwilinukunuku'oi'oi");
		asLog.error("Lauwiliwilinukunuku'oi'oi");
		//SpacedLogger:
		spLog.log("Elephant");
		spLog.error("Elephant");
		spLog.log("humuhumunukunukuapua'a");
		spLog.error("humuhumunukunukuapua'a");
	}

}
