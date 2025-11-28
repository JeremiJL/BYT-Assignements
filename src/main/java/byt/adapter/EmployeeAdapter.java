package byt.adapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeAdapter implements ITarget {

    private final BillingSystem thirdPartyBillingSystem = new BillingSystem();

    @Override
    public void processCompanySallary(String[][] employeesArray) {

        List<Employee> listEmployee = Arrays.stream(employeesArray).map(
                employeeData -> new Employee(
                        Integer.parseInt(employeeData[0]),
                        employeeData[1],
                        employeeData[2],
                        BigDecimal.valueOf(
                                Double.parseDouble(employeeData[3])
                        )
                )
        ).toList();

        thirdPartyBillingSystem.processSalary(listEmployee);
    }
}
