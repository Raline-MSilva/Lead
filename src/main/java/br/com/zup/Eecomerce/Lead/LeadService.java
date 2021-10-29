package br.com.zup.Eecomerce.Lead;

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
    public void pesquisarEmail(LeadDTO lead) {
        for (LeadDTO objetoReferencia : leads) {
            if (objetoReferencia.getEmail().equals(lead.getEmail())) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
            }
        }
        cadastrarLead(lead);
    }

}
