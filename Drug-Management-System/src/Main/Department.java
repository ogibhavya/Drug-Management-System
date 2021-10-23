package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Department {
    private String departmentName="";
    private ArrayList<Employee> employees;
    private ArrayList<Drug> drugs;

    public Department(String departmentName,ArrayList<Employee> employees,ArrayList<Drug> drugs) {
        this.departmentName=departmentName;
        this.employees=employees;
        this.drugs=drugs;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public ArrayList<Employee> getAllEmployees() {
        return this.employees;
    }

    public int getNoOfEmployees() {
        return this.employees.size();
    }
    public int getNoOfDrugs() {
        return this.drugs.size();
    }

    public Employee getEmployeeById(int id) {
        Iterator<Employee> employeeIterator = this.employees.iterator();

        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if(employee.getEmpId()==id) {
                return employee;
            }
        }
        return null;
    }

    public ArrayList<Drug> getAllDrugs() {
        return this.drugs;
    }

    public ArrayList<Drug> getAllExpiredDrugs() {
        ArrayList<Drug> expiredDrugs=new ArrayList<>();
        Iterator<Drug> drugIterator=this.drugs.iterator();

        while (drugIterator.hasNext()) {
            Drug drug = drugIterator.next();
            if(drug.getExpiryDate().compareTo(new Date())<0) {
                expiredDrugs.add(drug);
            }
        }
        return expiredDrugs;
    }

    public Drug getDrugById(int id) {
        Iterator<Drug> drugIterator = this.drugs.iterator();

        while(drugIterator.hasNext()) {
            Drug drug = drugIterator.next();
            if(drug.getDrugId()==id) {
                return drug;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);


    }

    public Employee removeEmployee(int id) {
        Iterator<Employee> employeeIterator=this.employees.iterator();

        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if(employee.getEmpId()==id) {
                this.employees.remove(employee);
                return employee;
            }
        }
        return null;

    }

    public void addDrug(Drug drug) {
        this.drugs.add(drug);
    }

    public Drug removeDrug(int id) {
        Iterator<Drug> drugIterator = this.drugs.iterator();
        while (drugIterator.hasNext()) {
            Drug drug = drugIterator.next();
            if(drug.getDrugId()==id) {
                this.drugs.remove(drug);
                return drug;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", drugs=" + drugs +
                '}';
    }
}
