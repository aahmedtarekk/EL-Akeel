package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import database.Meal;
import database.Restaurant;
import repo.RestaurantRepo;

@Stateless
public class RestaurantService {

    @PersistenceContext
    private EntityManager entityManager;

    public Restaurant getRestaurantById(int id) {
        return entityManager.find(Restaurant.class, id);
    }

    public void addMeal(Meal meal) {
        entityManager.persist(meal);
    }
    
    public List<Restaurant> selectAll() {
        return entityManager.createQuery("select c from Restaurant c", Restaurant.class).getResultList();
    }
}
