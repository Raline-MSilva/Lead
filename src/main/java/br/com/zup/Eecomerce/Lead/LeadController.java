package br.com.zup.Eecomerce.Lead;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public void cadastrarLead(@RequestBody LeadDTO leadDTO){
        leadService.cadastrarLead(leadDTO);
    }

}
