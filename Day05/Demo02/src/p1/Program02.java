package p1;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}

}

public class Program02 {

	public static void main(String[] args) {
		Set<Employee> employeeSet = new LinkedHashSet<>();
		employeeSet.add(new Employee(1, "Anil", 10000));
		employeeSet.add(new Employee(2, "Mukesh", 20000));
		employeeSet.add(new Employee(3, "Ramesh", 30000));
		employeeSet.add(new Employee(4, "Suresh", 40000));
		employeeSet.add(new Employee(5, "Ram", 50000));
		employeeSet.add(new Employee(3, "Ramesh", 30000)); // duplicate
		employeeSet.add(new Employee(3, "Sham", 60000)); // duplicate

		System.out.println("Size of employee set - " + employeeSet.size());

		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}
	}

}
