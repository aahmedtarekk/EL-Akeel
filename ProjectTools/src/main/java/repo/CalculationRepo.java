package repo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import database.Calculation;

@Stateless
public class CalculationRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public CalculationRepo() {
    }

    public void insert(Calculation calculation) {
        entityManager.persist(calculation);
    }

    public List<Calculation> selectAll() {
        return entityManager.createQuery("select c from Calculation c", Calculation.class).getResultList();
    }
}

