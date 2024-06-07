package week5CodingProject;

public class AsteriskLogger implements Logger{

	public void log(String str) {
		System.out.println("***" + str + "***");
	}
	public void error(String str) {
		System.out.println("*******************************************");
		System.out.println("***Error: " + str + "***");
		System.out.println("*******************************************");
	}
}
