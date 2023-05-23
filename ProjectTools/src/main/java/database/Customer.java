package database;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer extends User{
	
	@OneToOne
	@JoinColumn(name="customerorders_id")
	private CustomerOrders customerorder;

	public CustomerOrders getCustomerorder() {
		return customerorder;
	}

	public void setCustomerorder(CustomerOrders customerorder) {
		this.customerorder = customerorder;
	}
	
}
