package Main;

import Factory.PersonFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class DrugManagementSystem {

    public static void main(String args[]) {



        PersonFactory personFactory = new PersonFactory();
        Address address = new Address(112,"NW Street","New York","USA",56709);
        Employee employee = (Employee) personFactory.createPerson("Employee",1,"Pranshu",address);
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(employee);


        Category category = Category.ORAL;
        Company company = new Company("JSON Paramedix",new Date(67865),address,category);
        Drug drug = new Drug(1,"MEDX",new Date(98765),new Date(101654),company,"50ML");

        ArrayList<Drug> drugs = new ArrayList<>();
        drugs.add(drug);

        Department department = new Department("Basic Health Care",employees,drugs);
        department.addEmployee(employee);
        department.addDrug(drug);

        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(department);

        DrugStore drugStore = DrugStore.getInstance(departments);
        ArrayList<Department> depts = drugStore.getAllDepartments();

        Iterator<Department> departmentIterator = depts.iterator();

        while (departmentIterator.hasNext()) {
            Department dept = departmentIterator.next();
            System.out.println(dept.toString());
        }
















    }
}
