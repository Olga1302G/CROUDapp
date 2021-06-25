package webapplication.DAO;



import webapplication.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
public class UserDAOHibernate implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(User user) {
        entityManager.remove(user);
    }

    @Override
    public void editUser(User user) {
        entityManager.merge(user);
    }
}
