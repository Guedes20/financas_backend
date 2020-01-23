package br.com.minhasfinancas.serivce;

import java.util.List;

import br.com.minhasfinancas.entity.Lancamento;
import br.com.minhasfinancas.enuns.StatusLancamento;

public interface LancamentoService {
   
	Lancamento salvar(Lancamento lancamento);
	Lancamento atualizar(Lancamento lancamento);
	void deletar(Lancamento lancamento);
	List<Lancamento> buscar(Lancamento lancamento);
	Lancamento atualizarStatus(Lancamento lancamento, StatusLancamento status);
    void validar(Lancamento lancamento);
	
}