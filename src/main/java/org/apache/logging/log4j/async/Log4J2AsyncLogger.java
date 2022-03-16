/**
 * Async logging using Apache log4j2
 *
 * @param Log4J2AsyncLogger
 * @author A.T.M Ruhul Amin
 * @version 1.0
 * @since 2021-06-09
 */
package org.apache.logging.log4j.async;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2AsyncLogger {

    private static final Logger logger = LogManager.getLogger(Log4J2AsyncLogger.class);

    public static void main(String[] args) {

        Log4J2AsyncLogger myLog = new Log4J2AsyncLogger();
        myLog.getLog("Log4j2 Log");

    }

    private void getLog(String param){

        logger.info("This is a info log");

        // Previously, need to check the log level log to increase performance
        if(logger.isDebugEnabled()){
            logger.debug("This is debug log with param : " + param);
        }

        if(logger.isWarnEnabled()){
            logger.info("This is warn log with param : " + param);
        }

        // In Java 8, No need to check the log level, we can do this
        while (true) //for test rolling file
            logger.debug("Hello print {}", () -> getValue());
    }

    static String getValue() {
        return "Debug Log";
    }
}
