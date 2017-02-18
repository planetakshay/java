package interviewexcercises.orgconflict;

import java.util.Set;
import java.util.List;
import java.util.Set;

/**
 * Created by Deodhar Family on 2/16/2017.
 */
public class Employee {




	public Set<Employee> directReports;
	private Employee manager;



	public String firstName;



	private int level;

	public String getFirstName() {
		return firstName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	public Employee(Set<Employee> directReports, String firstName,int level) {
		this.directReports = directReports;
		this.firstName = firstName;
		this.level= level;
	}

	public void setDirectReports(Set<Employee> directReports) {
		this.directReports = directReports;
	}
	public void setDirectReport(Employee e){
		this.directReports.add(e);
	}
	public boolean hasDirectReport(Employee e){
		if(directReports.contains(e)){
			return true;
		}
		return false;
	}
	public Set<Employee> getDirectReports() {
		return directReports;
	}
	public boolean setManager(Employee manager){
		this.manager = manager;
		return true;
	}
	public Employee getManager(){
		return this.manager;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Employee)) return false;

		Employee employee = (Employee) o;

//		if (directReports != null ? !directReports.equals(employee.directReports) : employee.directReports != null)
//			return false;
//		if (getManager() != null ? !getManager().equals(employee.getManager()) : employee.getManager() != null)
//			return false;
		return firstName != null ? firstName.equals(employee.firstName) : employee.firstName == null;
	}

	@Override
	public int hashCode() {
		int result = directReports != null ? directReports.hashCode() : 0;
		result = 31 * result + (getManager() != null ? getManager().hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return firstName;
	}
}
