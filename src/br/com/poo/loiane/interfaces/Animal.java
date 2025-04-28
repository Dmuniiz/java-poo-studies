package br.com.poo.loiane.interfaces;

public abstract class Animal {

    /*quanto temos uma classe abstrata com somente métodos abstrato é valido transformar em interface
não é possível estender duas classes

    todo atributo declarado dentro de uma interface já é publico e estático	e final(constante)

       - pleonasmo */

    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
