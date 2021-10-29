package br.com.zup.Eecomerce.Produtos;

import br.com.zup.Eecomerce.Dtos.ProdutoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private List<ProdutoDTO> produtos = new ArrayList<>();

}
