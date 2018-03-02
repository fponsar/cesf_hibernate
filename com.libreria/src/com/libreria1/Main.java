package com.libreria1;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil.HibernateUtil;
import com.entity.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Libro libro = new Libro();
		
		libro.setTitol("La Celestina");
		libro.setTitol("titulo1");
		libro.setTitol("Eltitulo1");
		libro.setTitol("Tirant lo Blanc");
		libro.setTitol("titulo1");
		
		session.save(libro);
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
