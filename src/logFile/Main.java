package logFile;

public class Main {
	ILogger log;
	AbstractLoggerFactory l;
	Boolean b;
	public Main(boolean b) {
		// TODO Auto-generated constructor stub
		this.b=b;
	}

	public ILogger getLog() {
		return log;
	}

	public void setLog(ILogger log) {
		this.log = log;
	}

	public AbstractLoggerFactory getL() {
		return l;
	}

	public void setL(AbstractLoggerFactory l) {
		this.l = l;
	}

}
