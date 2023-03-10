package bean;

public class Item implements Comparable<Item>{
	private int storeId;
	private int ItemId;
	private String name;
	private double price;
	public Item() {

	}
	public Item(int storeId, int itemId, String name, double price) {
		super();
		this.storeId = storeId;
		ItemId = itemId;
		this.name = name;
		this.price = price;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
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
	public int compareTo(Item o) {
		return Double.compare(getPrice(), o.getPrice()) ;
	};
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
//		if(!(obj instanceof Item)) {
//			return false;
//		}
		if(obj == null || obj.getClass() != getClass()) {
			return false;
		}
//		Requirement: 2 items are equals if (same as storedId 7itemId & name & price)
		Item that = (Item)obj;
		return getStoreId() == that.getStoreId()
				&& getItemId() == that.getItemId()
				&& getPrice() == that.getPrice()
				&& getName().equals(that.getName());
	}
	@Override
	public String toString() {
		return "Item [storeId=" + storeId + ", ItemId=" + ItemId + ", name=" + name + ", price=" + price + "]";
	}

	
	
	


}
