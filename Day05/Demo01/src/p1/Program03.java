package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

public class Program03 {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Anil", 10000));
		employeeList.add(new Employee(2, "Mukesh", 20000));
		employeeList.add(new Employee(3, "Ramesh", 30000));
		employeeList.add(new Employee(4, "Suresh", 40000));
		employeeList.add(new Employee(5, "Ram", 50000));

		Employee e1 = new Employee();
		e1.empid = 3;
		System.out.println("e1 - " + e1);

		System.out.println("employeelist contains emp with id 3 - " + employeeList.contains(e1));
		System.out.println("index of emp with id 3 - " + employeeList.indexOf(e1));

		e1.empid = 4;
		System.out.println("remove an employee with id 4 - " + employeeList.remove(e1));

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}

}
