package br.com.zup.Eecomerce.Lead;

import br.com.zup.Eecomerce.Lead.LeadDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LeadService {
    private List<LeadDTO> leads = new ArrayList<>();

    //exibir os leads
    public List<LeadDTO> exibirLeads() {
        return leads;
    }

    //cadastrar lead
    public void cadastrarLead(LeadDTO lead) {
        leads.add(lead);
    }

}
