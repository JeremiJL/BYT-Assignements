package byt.adapter;

import java.util.List;

public class BillingSystem {

    public void processSalary(List<Employee> listEmployee) {

        for (Employee employee : listEmployee)
        {
            System.out.println("Rs." + employee.salary + " Salary Credited to " + employee.name + " Account");
        }
    }

}
