package Log4jsample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertiesFile {
	static Logger logs=Logger.getLogger(Log4jPropertiesFile.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		logs.debug("This is Debug message");
		logs.info("This is Info message");
		logs.warn("This is warn message");
		logs.error("This is error message");
		logs.fatal("This is fatal message");


	}

}
