import java.util.logging.Level;
import java.util.logging.Logger;

public class LogginLab {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    private static Integer threshold = 0;

    public LogginLab() {
        threshold = 0;
    }

    public static void main(String[] args) {
        //logger.setLevel(Level.WARNING);
        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error!");

        logger.log(Level.INFO, "****\n\tAt ZipCode, \n\twe don't use System.out.Println \n\tuntil we've earned the right.\n****");
        thresholdExceeds(-10);
        thresholdReached(0);
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public static boolean thresholdExceeds(Integer limit) {
        logger.log(Level.INFO, "You passed in " + limit);
        if (threshold > limit) {
            logger.log(Level.WARNING, threshold + " exceeds limit of " + limit);
            return true;
        }
        else
            return false;
    }

    // Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.
    public static boolean thresholdReached(Integer limit) {
        logger.log(Level.INFO, "You passed in " + limit);
        if (limit > threshold) {
            logger.log(Level.WARNING, limit + " exceeds limit of " + threshold);
            return true;
        }
        else
            return false;
    }
    // use thresholdExceeds for a pattern.
    // Write a test for the method in the Test class.
}
