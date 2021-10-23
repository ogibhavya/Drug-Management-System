import Main.Address;
import Main.Department;
import Main.Drug;
import Main.Employee;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;




import java.util.ArrayList;
import java.util.Date;

public class TestDepartment {

    Department department;
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Drug> drugs;
    Address address;
    @Before
    public void setUp() {
        drugs = new ArrayList<>();
        address = new Address(231,"Main Street","LONDON","UK",32456);
        employees.add(new Employee(2,"Max",address));
        drugs.add(new Drug(1,"ParaMedico",new Date(22678),new Date(25789),null,"450ML"));
        drugs.add(new Drug(2,"Bizil",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()+1000),null,"500ML"));
        department = new Department("Basic HealthCare",employees,drugs);
    }

    @Test
    public void testDepartmentName() {
        assertEquals("Basic HealthCare",department.getDepartmentName());
    }

    @Test
    public void testEmployeeCount() {
        assertEquals(1,department.getAllEmployees().size());

    }
    @Test
    public void testDrugsCount() {
        assertEquals(2,department.getAllDrugs().size());
        assertEquals(1,department.getAllExpiredDrugs().size());
    }


}
