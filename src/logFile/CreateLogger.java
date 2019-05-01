package logFile;

public class CreateLogger extends AbstractLoggerFactory{

	Boolean bool;
	public CreateLogger(Boolean b) {
		// TODO Auto-generated constructor stub
		super();
		this.bool=b;
	}
	@Override
	ILogger LoggerFactory (Boolean rep) {
		return null;
		// TODO Auto-generated method stub
		
	}
}

