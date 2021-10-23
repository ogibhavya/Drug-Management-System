package Factory;
import Main.*;


public class PersonFactory {
    public Person createPerson(String type,int empId,String employeeName,Address address) {
        if(type == null || type.isEmpty()) {
            return null;
        }
        if(type.equalsIgnoreCase("Employee")) {
            return new Employee(empId,employeeName,address);
        }
        return null;
    }
}
