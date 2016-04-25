package org.oursight.learning.jpa.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.oursight.learning.jpa.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class JpaUserDao {

    @PersistenceContext
    private EntityManager em;

    public void save(User user) {
        em.persist(user);

    }

    public List<User> list() {
        return em.createQuery("select u from User u").getResultList();
    }

}

