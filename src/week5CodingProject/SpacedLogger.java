package week5CodingProject;

public class SpacedLogger implements Logger{
	public void log(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			result.append(" ");
			result.append(str.charAt(i));
		}
		System.out.println(result.toString());
	}
	
	public void error(String str) {
	StringBuilder result = new StringBuilder();
	for (int i = 0; i < str.length(); i++) {
		result.append(" ");
	result.append(str.charAt(i));
	}
	System.out.println("Error: " + result.toString());
	}
}
