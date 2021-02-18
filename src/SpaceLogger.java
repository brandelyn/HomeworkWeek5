
public class SpaceLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(formatLogger(log));
	}
	String formatLogger(String log) {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < log.length(); i++) {
			builder.append(log.charAt(i)).append(" ");
		}
		return builder.toString();
	}
	
	@Override
	public void error(String error) {
		System.out.println("ERROR: " + formatLogger(error));
		
		
	}

}
