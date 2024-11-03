import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyGenListWithEmployeeTest {
    public static void main(String[] args) {
        MyGenList<Employee> employeeList = new MyGenList<>();

        employeeList.add(new Employee("E001", "Alice", 28, new GregorianCalendar(2020, Calendar.JUNE, 15).getTime()));
        employeeList
                .add(new Employee("E002", "Bob", 32, new GregorianCalendar(2018, Calendar.SEPTEMBER, 20).getTime()));
        employeeList
                .add(new Employee("E003", "Charlie", 25, new GregorianCalendar(2021, Calendar.APRIL, 10).getTime()));

        System.out.println("Initial Employee List:");
        System.out.println(employeeList);

        employeeList.deleteByIndex(1);
        System.out.println("\nAfter deleting employee at index 1:");
        System.out.println(employeeList);

        Employee empToDelete = new Employee("E003", "Charlie", 25, new Date(2021 - 1900, 3, 10));
        employeeList.deleteByValue(empToDelete);
        System.out.println("\nAfter deleting employee 'Charlie':");
        System.out.println(employeeList);

        Employee retrievedEmployee = employeeList.get(0);
        System.out.println("\nRetrieved Employee at index 0:");
        System.out.println(retrievedEmployee);
    }
}
