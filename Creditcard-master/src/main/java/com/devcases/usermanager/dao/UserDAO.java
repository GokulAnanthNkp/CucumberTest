package com.devcases.usermanager.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devcases.usermanager.model.User;

@Component
public class UserDAO {

	@PersistenceContext
	private EntityManager em;	
	
	public List<User> getAllUser(String panNumber) {
        TypedQuery<User> query = em.createQuery(
        		"SELECT u FROM User u where u.pannumber= :panNum ", User.class);
        query.setParameter("panNum", panNumber);
        return query.getResultList();
    }

}
