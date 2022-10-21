package com.demo;



import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save() {
		Session session = sessionFactory.getCurrentSession();
		User user = new User(102,"Dave","Dykes","dave@gmail.com");
		session.save(user);
	}
}