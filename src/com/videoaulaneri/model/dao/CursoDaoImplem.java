package com.videoaulaneri.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.videoaulaneri.model.model.CursoModel;

public class CursoDaoImplem implements CursoDaoInterface{

	@PersistenceContext(unitName="Projeto4FinalPersistenceUnit")
	private EntityManager entityManager;
	
	//curso Neri
	@Override
	public CursoModel salvarCurso(CursoModel cursoModel) {
		entityManager.persist(cursoModel);
		return cursoModel;
	}

	@Override
	public void alterar(CursoModel cursoModel) {
		CursoModel cursoModelMerge = entityManager.merge(cursoModel);
		entityManager.persist(cursoModelMerge);
		
	}

	@Override
	public void excluir(CursoModel cursoModel) {
		CursoModel cursoModelMerge = entityManager.merge(cursoModel);
		entityManager.remove(cursoModelMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<CursoModel> getCursos() {
	    Query query = entityManager.createQuery("from CursoModel");
	    return query.getResultList();
	}

}
