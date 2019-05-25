package Main;

import static org.junit.Assert.assertTrue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit test for simple Main.
 */
@RunWith(Cucumber.class)
@CucumberOptions()
public class MainTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

}
