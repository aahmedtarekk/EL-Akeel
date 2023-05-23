package database;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CustomerOrders {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private Date date;
	
	@OneToOne(mappedBy="customerorder")
	private Customer customer;
	
	@OneToOne(mappedBy="customerOrders")
	private Runner runner;
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	private Restaurant restaurant;
	private double fees;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Runner getRunner() {
		return runner;
	}
	public void setRunner(Runner runner) {
		this.runner = runner;
	}
	
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
}
