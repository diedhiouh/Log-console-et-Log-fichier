package logFile;

public class LoggerFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		AbstractLoggerFactory factory=new LoggerFactory(false);
		ILogger logger =factory.createLogger();
		logger.log(Main.class.toString(), "Bonjour");
		logger.log(Main.class.toString(), "le");
		logger.log(Main.class.toString(), "monde");
		
	}

}
