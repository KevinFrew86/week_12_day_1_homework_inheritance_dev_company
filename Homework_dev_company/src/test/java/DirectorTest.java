import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("King Kevy", "JW420666", 1000000, "Big Muscles Dept", 500000);
    }

    @Test
    public void directorHasName() {
        assertEquals("King Kevy", director.getName());
    }

    @Test
    public void directorHasNINumber() {
        assertEquals("JW420666", director.getNiNumber());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(1000000, director.getSalary(), 0.1);
    }

    @Test
    public void directorHasDept() {
        assertEquals("Big Muscles Dept", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2);
        assertEquals(2000000, director.getSalary(), 0.1);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(10000, director.payBonus(), 0.1);
    }

    @Test
    public void canGetBudget() {
        assertEquals(500000, director.getBudget(), 0.1);
    }
}
