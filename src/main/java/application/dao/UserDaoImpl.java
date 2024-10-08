package application.dao;

import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    public EntityManager em;


    private UserDao userDao;

    @Transactional
    @Override
    public List<User> getAllUsers() {

        return   em.createQuery("from User", User.class).getResultList();


    }
}
