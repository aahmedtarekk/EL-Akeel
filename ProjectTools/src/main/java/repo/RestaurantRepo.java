package repo;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import database.Restaurant;

public class RestaurantRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public RestaurantRepo() {
    }

    public void insert(Restaurant restaurant) {
        entityManager.persist(restaurant);
    }

    public List<Restaurant> selectAll() {
        return entityManager.createQuery("select c from Restaurant c", Restaurant.class).getResultList();
    }
}