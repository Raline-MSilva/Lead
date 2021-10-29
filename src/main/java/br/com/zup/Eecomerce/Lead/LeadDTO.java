package br.com.zup.Eecomerce.Lead;

import br.com.zup.Eecomerce.Produtos.ProdutoDTO;

import java.util.List;

public class LeadDTO {
    private String nome;
    private String email;
    private String telefone;
    private List<ProdutoDTO> produtos;

    public LeadDTO() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}
