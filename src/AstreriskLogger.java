import java.util.Date;

public class AstreriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(formatLog(log));
	}

	public String formatLog(String log) {
		return "*********" + log + "*********";
	}

	@Override
	public void error(String error) {
		String formatted = formatLog("ERROR: " + error);
		String stars = "*".repeat(formatted.length());
		System.out.println(stars);
		System.out.println(formatted);
		System.out.println(stars);
		
		
	
		
	}

}
