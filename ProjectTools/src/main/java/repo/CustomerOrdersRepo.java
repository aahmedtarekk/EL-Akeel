package repo;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import database.CustomerOrders;

public class CustomerOrdersRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public CustomerOrdersRepo() {
    }

    public void insert(CustomerOrders customerOrders) {
        entityManager.persist(customerOrders);
    }

    public List<CustomerOrders> selectAll() {
        return entityManager.createQuery("select c from CustomerOrders c", CustomerOrders.class).getResultList();
    }
}