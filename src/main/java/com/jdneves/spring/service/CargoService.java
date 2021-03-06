package com.jdneves.spring.service;

import java.util.List;

import com.jdneves.spring.domain.Cargo;
import com.jdneves.spring.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscarPorPagina(Integer pagina, String ordenacao);
}
