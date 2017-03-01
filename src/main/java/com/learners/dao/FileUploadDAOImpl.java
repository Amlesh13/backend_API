package com.learners.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learners.entities.UploadFile;
import com.learners.service.interfaces.FileUploadDAO;

@Repository
public class FileUploadDAOImpl implements FileUploadDAO {
	
	//@Autowired
	private SessionFactory sessionFactory;
	public FileUploadDAOImpl() {
	}
	public FileUploadDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void save(UploadFile uploadFile) {
		sessionFactory.getCurrentSession().save(uploadFile);
	}

}
