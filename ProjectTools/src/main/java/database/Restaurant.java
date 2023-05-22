package database;

import javax.ejb.Stateless;
import javax.persistence.Id;

@Stateless
public class Restaurant {

	@id
	private int id;

	private String name;
	private int ownerId;
	private int list_of_meals[];
	
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
	public int[] getList_of_meals() {
		return list_of_meals;
	}
	public void setList_of_meals(int list_of_meals[]) {
		this.list_of_meals = list_of_meals;
	}
	


}
