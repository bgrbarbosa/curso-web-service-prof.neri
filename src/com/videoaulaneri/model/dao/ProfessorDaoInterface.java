package com.videoaulaneri.model.dao;

import java.util.List;

import com.videoaulaneri.model.model.ProfessorModel;

public interface ProfessorDaoInterface {
	
  ProfessorModel salvarProfessor(ProfessorModel professorModel);
  
  void alterar(ProfessorModel professorModel);
  
  void excluir(ProfessorModel professorModel);
  
  List<ProfessorModel> getProfessores();
  
}
