package com.uca.capas.practico.dao.importancia;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.practico.domain.Importancia;


public interface ImportanciaDAO 
{
	public List<Importancia> getAll() throws DataAccessException;
}
