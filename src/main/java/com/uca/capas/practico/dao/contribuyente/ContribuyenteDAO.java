package com.uca.capas.practico.dao.contribuyente;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.practico.domain.Contribuyente;

public interface ContribuyenteDAO 
{
	public List<Contribuyente> getAll() throws DataAccessException;
}
