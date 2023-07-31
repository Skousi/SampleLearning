package Log4jsample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicLog4jConfig {
	static Logger logs=Logger.getLogger(BasicLog4jConfig.class); //factory design patter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		logs.debug("This is Debug message");
		logs.info("This is Info message");
		logs.warn("This is warn message");
		logs.error("This is error message");
		logs.fatal("This is fatal message");

	}

}
