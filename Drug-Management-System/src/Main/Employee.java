package Main;

public class Employee implements Person {
    private int empId;
    private String employeeName;
    private Address address;
    public Employee(int empId, String employeeName, Address address) {
        this.empId=empId;
        this.employeeName=employeeName;
        this.address=address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", employeeName='" + employeeName + '\'' +
                ", address=" + address +
                '}';
    }
}
