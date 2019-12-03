package br.com.exerciciorevisao2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Aula aula;
    private Aluno aluno;
    private Professor professorResponsavel;

    public Curso(Professor professor) {
        this.professorResponsavel = professor;
    }

    private List<Aula> listaAulas = new ArrayList<>();

    public void addAula (Aula aula){
        listaAulas.add(aula);
    }

    private List<Aluno>listaAlunos = new ArrayList<>();

    public void addAluno (Aluno aluno){
        listaAlunos.add(aluno);
    }

}
