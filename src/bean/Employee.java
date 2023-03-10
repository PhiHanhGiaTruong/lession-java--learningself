package bean;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Integer namegerId;

	public Employee() {
	}

	public Employee(int id, String name, double salary, Integer namegerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.namegerId = namegerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getNamegerId() {
		return namegerId;
	}

	public void setNamegerId(int namegerId) {

		this.namegerId = namegerId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee that = (Employee)obj;
		return getId() == that.getId()
		&& getName().equals(that.getName())
		&& getSalary() == that.getSalary()
		&& getNamegerId() == that.getNamegerId();
		
	}
	@Override
	public int hashCode() {
return Objects.hash(getId(), getName(), getSalary(), getNamegerId());
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", namegerId=" + namegerId + "]";
	}

}
