package br.com.poo.alura.arraylist;

public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidade=" + getQuantidade() +
                "dataValidade='" + dataValidade + '\'' +
                '}';
    }
}
