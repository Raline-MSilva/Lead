package br.com.zup.Eecomerce.Lead;

import br.com.zup.Eecomerce.Produtos.ProdutoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.ArrayList;
import java.util.List;


@Service
public class LeadService {
    private List<LeadDTO> leads = new ArrayList<>();

    //cadastrar lead
    public void cadastrarLead(LeadDTO lead) {
        leads.add(lead);
    }

    //exibir os leads cadastrados
    public List<LeadDTO> exibirLeads() {
        return leads;
    }

    //nao cadastrar leads com o mesmo email
    public boolean pesquisarEmailRepetido(LeadDTO lead) {
        boolean emailRepetido = false;
        for (LeadDTO objetoReferencia : leads) {
            if (objetoReferencia.getEmail().equals(lead.getEmail())) {
                emailRepetido = true;
            }
        }
        return emailRepetido;
    }

    //percorrer lista e achar leads com email iguais
    public LeadDTO buscarLead (String email){
        for (LeadDTO objetoReferencia : leads){
            if (objetoReferencia.getEmail().equals(email)){
                return objetoReferencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    //nao cadastrar produtos iguais no mesmo email
    public void compararListaProdutos (LeadDTO leadNovo){
        LeadDTO leadAntigo = buscarLead(leadNovo.getEmail());
        for (ProdutoDTO produtosNovos : leadNovo.getProdutos()){
            for (ProdutoDTO produtosAntigos : leadAntigo.getProdutos()){
                if (produtosNovos.equals(produtosAntigos)){
                    throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
                }
            }
        }
    }

}
