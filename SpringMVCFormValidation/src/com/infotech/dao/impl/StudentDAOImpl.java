package com.infotech.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.infotech.dao.StudentDAO;
import com.infotech.model.Student;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {
	private static SessionFactory factory;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Override
	public boolean saveStudent(Student student) {
	int id = (Integer)hibernateTemplate.save(student);
		//int id=1;
		if(id>0)
			return true;
		return false;
	}
	
	@Override
	public void listEmployees( ) {
		Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM book1").list(); 
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
	            Student employee = (Student) iterator.next(); 
	            System.out.print("First Name: " + employee.getBookName()); 
	            System.out.print("  Last Name: " + employee.getBookId()); 
	            System.out.println("  Salary: " + employee.getAuthor()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
}
