package Log4jsample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jXmlFile {
	static Logger logs=Logger.getLogger(Log4jXmlFile.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		DOMConfigurator.configure("log4j.xml");
		logs.debug("This is Debug message");
		logs.info("This is Info message");
		logs.warn("This is warn message");
		logs.error("This is error message");
		logs.fatal("This is fatal message");
	}

}
