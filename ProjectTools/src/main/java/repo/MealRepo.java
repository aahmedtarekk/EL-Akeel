package repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import database.Meal;

public class MealRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public MealRepo() {
    }

    public void insert(Meal meal) {
        entityManager.persist(meal);
    }

    public List<Meal> selectAll() {
        return entityManager.createQuery("select c from Meal c", Meal.class).getResultList();
    }
}
