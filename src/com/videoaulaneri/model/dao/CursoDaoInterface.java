package com.videoaulaneri.model.dao;

import java.util.List;

import com.videoaulaneri.model.model.CursoModel;

public interface CursoDaoInterface {
	
  CursoModel salvarCurso(CursoModel cursoModel);
  
  void alterar(CursoModel cursoModel);
  
  void excluir(CursoModel cursoModel);
  
  List<CursoModel> getCursos();
  
}
