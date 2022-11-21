package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createNativeQuery("select * from users", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser(int id) {
        return entityManager.createQuery("select u from User u where u.id = :id", User.class)
                .setParameter("id", id).getSingleResult();
    }

    @Override
    public void update(int id, User updateUser) {
        User user = getUser(id);
        user.setName(updateUser.getName());
        user.setSurname(updateUser.getSurname());
        user.setAge(updateUser.getAge());
        entityManager.merge(user);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(getUser(id));
    }
}
