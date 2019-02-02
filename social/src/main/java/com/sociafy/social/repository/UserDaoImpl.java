package com.sociafy.social.repository;

import com.sociafy.social.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean saveUser(UserEntity userEntity) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
