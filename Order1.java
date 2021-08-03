package TestonHashmap;

public class Order1
{
	int orderid;
	String city;
	String itemname;
	String status;
	
	public Order1(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", city=" + city + ", itemname=" + itemname + ", status=" + status + "]";
	}

	public void Order1(int orderid, String city, String itemname, String status) {
	//	super();
		this.orderid = orderid;
		this.city = city;
		this.itemname = itemname;
		this.status = status;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
