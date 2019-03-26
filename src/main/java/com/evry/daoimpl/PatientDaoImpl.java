package com.evry.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.evry.dao.PatientDao;
import com.evry.model.Patient;
import com.evry.util.HibernateUtil;

public class PatientDaoImpl implements PatientDao{
	public void addPatient(Patient patient) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction trn=session.beginTransaction();
        session.save(patient);
        trn.commit();
        
		
	}

	@Override
	public List<Patient> getAllPatients() {
		List<Patient> patientList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Patient");
        patientList = query.list();
        return patientList;
	}
}
