package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item>{
	private int id;
	private String name;
	private double price;
	private LocalDate expiredDate;
	public Item() {

	}
	public Item(int id, String name, double price, LocalDate expiredDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.expiredDate = expiredDate;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", expiredDate=" + expiredDate + "]\n";
	}

//	public int compareTo(Item that) {
//		ID ASC
//		return this.getId() - that.getId();
//		return that.getId() - this.getId();
//		
//	}
	public int compareTo(Item that) {
//		Name ASC
//		return this.getName().compareTo(that.getName());
//		Expire Date ASC
//		return this.getExpiredDate().compareTo(that.getExpiredDate());
//		Price ASC, ID ASC
		double result = this.getPrice() - that.getPrice();
		if(result != 0) return (int) result;
		if(result < 0) return -1;
		if(result > 0) return 1;
			
		return that.getId() - this.getId();
	}

	


}
