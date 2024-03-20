package com.example.aula40;

public class Aluno {
    private String nome;
    private int id;
    private String status;
    private String matricula;

    public Aluno(String nome, int id, String status, String matricula) {
        this.nome = nome;
        this.id = id;
        this.status = status;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMatricula() {
        return matricula;
    }
}
