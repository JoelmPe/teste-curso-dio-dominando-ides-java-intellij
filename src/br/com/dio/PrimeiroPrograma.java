package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Uma mente milionária ", 388);

        System.out.println(livro1);

        /*int a = 5;
        int b = 3;

        System.out.println("Hello World!"  + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numpgns;

    public Livro(String nome, Integer numpgns) {
        this.nome = nome;
        this.numpgns = numpgns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpgns() {
        return numpgns;
    }

    public void setNumpgns(Integer numpgns) {
        this.numpgns = numpgns;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpgns=" + numpgns +
                '}';
    }
}
