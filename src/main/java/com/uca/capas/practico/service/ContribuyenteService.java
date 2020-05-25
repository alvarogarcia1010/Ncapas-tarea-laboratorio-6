package com.uca.capas.practico.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.practico.domain.Contribuyente;
import com.uca.capas.practico.domain.Importancia;

public interface ContribuyenteService {
	
	public List<Importancia> getListaDeImportancias() throws DataAccessException;
	
	public List<Contribuyente> getAll() throws DataAccessException;
	
	public void save(Contribuyente contribuyente) throws DataAccessException;

}
