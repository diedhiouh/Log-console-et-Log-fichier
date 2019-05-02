package logFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class FileLog implements ILogger {
	
	public FileLog() {
		
	}
	
	@Override
	public void log(String string, String text) {
		// TODO Auto-generated method stub
		System.out.println("LOGUER DANS UN FICHIER =>"+text);
		File logger=new File("Log.log");
		if(!logger.exists()) {
			try {
				logger.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
		try {
			FileWriter write=new FileWriter(logger);
			BufferedWriter Buf =new BufferedWriter(write);
			Buf.newLine();
			Buf.write(text);
			Buf.close();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
}