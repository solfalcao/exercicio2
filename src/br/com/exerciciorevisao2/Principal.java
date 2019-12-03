package br.com.exerciciorevisao2;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno (000001, "Silmara");
        Aluno aluno1 = new Aluno (000002, "Estevão");
        Professor professor = new Professor ("Pedro");
        Curso curso = new Curso ("Adriano");


        Curso listaAlunos = new Curso("Pedro");
        listaAlunos.addAluno(aluno1);
        listaAlunos.addAluno(aluno);






    }
}
