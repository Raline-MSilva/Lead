package br.com.zup.Eecomerce.Lead;

import org.springframework.stereotype.Service;


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

}
