package database;

import javax.ejb.Stateful;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Stateful
public class Runner extends User{
	
	@OneToOne
	@JoinColumn(name="customerorders_id")
	private CustomerOrders customerOrders;
	
	private boolean status;
	private double delivery_fees;

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getDelivery_fees() {
		return delivery_fees;
	}
	public void setDelivery_fees(double delivery_fees) {
		this.delivery_fees = delivery_fees;
	}
	public CustomerOrders getCustomerOrders() {
		return customerOrders;
	}
	public void setCustomerOrders(CustomerOrders customerOrders) {
		this.customerOrders = customerOrders;
	}

	

}
