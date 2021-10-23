import Factory.PersonFactory;
import Main.Address;
import Main.Employee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestEmployee {

    Address address;
    Employee employee;
    PersonFactory personFactory;
    @Before
    public void setUp() {
        address = new Address(123,"NW Street","New York","USA",23456);
        personFactory = new PersonFactory();
        employee = (Employee) personFactory.createPerson("Employee",1,"Jason",address);

    }

    @Test
    public void testGetId() {
        assertEquals(1,employee.getEmpId());
    }

    @Test
    public void testGetName() {
        assertEquals("Jason",employee.getEmployeeName());
    }

}
