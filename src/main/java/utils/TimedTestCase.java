package utils;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.logging.Logger;

/**
 * Created by marek5050 on 10/26/16.
 */
@RunWith(Parameterized.class)
public class TimedTestCase extends TestCase {
    public static Logger log = Logger.getAnonymousLogger();

    public long start = 0;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",  "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %5$s%6$s%n");
    }

    @Before
    public void setUp() {
        start = System.currentTimeMillis();
    }

    @After
    public void tearDown() {}
}
