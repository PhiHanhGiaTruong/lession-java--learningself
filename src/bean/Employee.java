package bean;

public class Employee {
private int id;
private String name;
private Integer namegerId;

public Employee() {
}

public Employee(int id, String name, Integer namegerId) {
	super();
	this.id = id;
	this.name = name;
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

public Integer getNamegerId() {
	return namegerId;
}

public void setNamegerId(Integer namegerId) {
	this.namegerId = namegerId;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", namegerId=" + namegerId + "]";
}

}

