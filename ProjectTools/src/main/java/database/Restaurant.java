package database;

import javax.ejb.Stateless;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Stateless
@Entity
public class Restaurant {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

	private String name;
	
	private int ownerId;
	
	@OneToMany(mappedBy="restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Meal> menu;
	
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
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public List<Meal> getMenu() {
		return menu;
	}
	public void setMenu(List<Meal> menu) {
		this.menu = menu;
	}
}