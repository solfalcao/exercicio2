package br.com.exerciciorevisao2;

public class Aluno {
    private int RA;
    private String nome;
    private String sobrenome;

    public Aluno(int RA, String nome) {
        this.RA = RA;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
        }

        public int getRA(){
        return RA;
    }

    public boolean assistirAula(){
        return true;
    }

    public boolean fazerLicaoCasa(){
        return true;
    }
}
