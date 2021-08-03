package TestonHashmap;

public class Item
{
	int id;
	String iname;
	int price;
	int qty;
	
	public Item() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", iname=" + iname + ", price=" + price + ", qty=" + qty + "]";
	}

	public Item(int id, String iname, int price, int qty) {
		super();
		this.id = id;
		this.iname = iname;
		this.price = price;
		this.qty = qty;
	}
	
		}


