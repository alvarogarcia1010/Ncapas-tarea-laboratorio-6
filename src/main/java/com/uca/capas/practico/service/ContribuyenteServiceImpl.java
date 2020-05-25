package com.uca.capas.practico.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.practico.dao.contribuyente.ContribuyenteDAO;
import com.uca.capas.practico.dao.importancia.ImportanciaDAO;
import com.uca.capas.practico.domain.Contribuyente;
import com.uca.capas.practico.domain.Importancia;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService 
{
	@Autowired
	ImportanciaDAO importanciaDAO;
	
	@Autowired
	ContribuyenteDAO contribuyenteDAO;

	@Override
	public List<Importancia> getListaDeImportancias() throws DataAccessException 
	{
		return importanciaDAO.getAll();
	}

	@Override
	public List<Contribuyente> getAll() throws DataAccessException 
	{
		return contribuyenteDAO.getAll();
	}
	
	@Override
	@Transactional
	public void save(Contribuyente contribuyente) throws DataAccessException {
		contribuyenteDAO.save(contribuyente);		
	}
	
}
