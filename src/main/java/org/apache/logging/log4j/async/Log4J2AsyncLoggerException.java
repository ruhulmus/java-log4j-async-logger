/**
 * Async logging using Apache log4j2
 *
 * @param Log4J2AsyncLoggerException
 * @author A.T.M Ruhul Amin
 * @version 1.0
 * @since 2021-06-09
 */
package org.apache.logging.log4j.async;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2AsyncLoggerException {

    private static final Logger logger = LogManager.getLogger(Log4J2AsyncLoggerException.class);

    public static void main(String[] args) {

        try {
            System.out.println(getException());
        } catch (IllegalArgumentException e) {
            logger.error("{}", e);
        }
    }

    static int getException() throws IllegalArgumentException {
        throw new IllegalArgumentException("Hello, Something Went Wrong. Exception Occured!!");
    }

}
