import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Benny Harvey", "JW1967", 25000);
    }

    @Test
    public void developerHasName() {
        assertEquals("Benny Harvey", developer.getName());
    }

    @Test
    public void developerHasNUNumber() {
        assertEquals("JW1967", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(25000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2);
        assertEquals(50000, developer.getSalary(), 0.1);
    }

    @Test
    public void canCalculateBonus() {
        assertEquals(250, developer.payBonus(), 0.1);
    }
}
