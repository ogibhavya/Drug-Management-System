package Main;

import java.util.ArrayList;
import java.util.Iterator;

public class DrugStore {
    private static DrugStore drugStore = null;
    private ArrayList<Department> departments;
    private DrugStore(ArrayList<Department> departments) {
        this.departments=departments;
    }



    public static DrugStore getInstance(ArrayList<Department> departments) {
        if(drugStore == null) {
            drugStore = new DrugStore(departments);
        }
        return drugStore;
    }

    public ArrayList<Department> getAllDepartments() {
        return this.departments;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public Department getDepartmentByName(String departmentName) {
        Iterator<Department> departmentIterator = this.departments.iterator();
        while(departmentIterator.hasNext()) {
            Department department = departmentIterator.next();
            if(department.getDepartmentName().equals(departmentName)) {
                return department;
            }
        }
        return null;
    }
}
