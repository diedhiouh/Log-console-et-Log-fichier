package logFile;

public class Logger {

	ILogger log;
	AbstractLoggerFactory l;
	
	public Logger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractLoggerFactory factory=new LoggerFactory(true);
//		ILogger logger =factory.createLogger();
//		logger,log(Main.class.toString(), "Bonjour");
//		logger,log(Main.class.toString(), "le");
//		logger,log(Main.class.toString(), "monde");
		
	}

}
