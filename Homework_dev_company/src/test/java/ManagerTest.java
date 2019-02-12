import org.junit.Before;
import org.junit.Test;
import Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bossman Kevy", "JW420666", 500000, "Cool guy Dept");
    }

    @Test
    public void managerHasName() {
        assertEquals("Bossman Kevy", manager.getName());
    }

    @Test
    public void managerHasNINumber() {
        assertEquals("JW420666", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(500000, manager.getSalary(), 0.1);
    }

    @Test
    public void managerHasDept() {
        assertEquals("Cool guy Dept", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2);
        assertEquals(1000000, manager.getSalary(), 0.1);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(5000, manager.payBonus(), 0.1);
    }
}
