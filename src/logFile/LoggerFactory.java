package logFile;

public class LoggerFactory extends AbstractLoggerFactory{

	Boolean bool;
	String l;
	public LoggerFactory(Boolean b) {
		// TODO Auto-generated constructor stub
		super();
		this.bool=b;
	}
	@Override
	ILogger createLogger() {
		// TODO Auto-generated method stub
		if(bool==true) {
			return new FileLog();
		}
		else{
			return new ConsoleLog();
		}
	}
	
}

