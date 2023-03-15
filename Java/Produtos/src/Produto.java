public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double p) {
        this.preco = p;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorTotal(double preco, int quantidade) {
        return this.preco * this.quantidade;
    }

}
