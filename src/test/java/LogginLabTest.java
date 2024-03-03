import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is "+i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }
    // Given
    @Test
    public void given1and10_whenThresholdReached_thenFalse(){
        // Given
        var limit = 1;
        var threshold = 10;
        // Expected
        var expected = false;
        // When
        LogginLab lab = new LogginLab();
        lab.setThreshold(threshold);
        var actual = lab.thresholdReached(limit);
        //Assert
        Assert.assertEquals(expected, actual);
        logger.log(Level.INFO, "This is a test!");
    }

    @Test
    public void given5and1_whenThresholdReached_thenTrue(){
        // Given
        var limit = 5;
        var threshold = 1;
        // Expected
        var expected = true;
        // When
        LogginLab lab = new LogginLab();
        lab.setThreshold(threshold);
        var actual = lab.thresholdReached(limit);
        //Assert
        Assert.assertEquals(expected, actual);
        logger.log(Level.INFO, "This is also a test!");
    }

}

