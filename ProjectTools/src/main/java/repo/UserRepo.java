package repo;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import database.User;

@ApplicationScoped
@Transactional
public class UserRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public UserRepo() {
    }

    public void insert(User user) {
        entityManager.persist(user);
    }

    public List<User> selectAll() {
        return entityManager.createQuery("select c from User c", User.class).getResultList();
    }
    
    public User selectByName(String name) {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.name = :name", User.class);
        query.setParameter("name", name);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
