package com.uca.capas.practico.dao.contribuyente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.practico.domain.Contribuyente;

@Repository
public class ContribuyenteDAOImpl implements ContribuyenteDAO {
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Contribuyente> getAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("Select * from public.contribuyente");
		Query query = entityManager.createNativeQuery(sb.toString(), Contribuyente.class);
		List<Contribuyente> resulset = query.getResultList();
		
		return resulset;
	}
}
