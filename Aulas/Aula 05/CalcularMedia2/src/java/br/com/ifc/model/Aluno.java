/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.model;

/**
 *
 * @author fabricio
 */
public class Aluno {

    private String nome;
    private Character sexo;
    private String disciplina;
    private String professor;
    private double[] notas;
    private String media;

    public Aluno() {
    }

    public Aluno(String nome, Character sexo, String disciplina, String professor, double[] notas, String media) {
        this.nome = nome;
        this.sexo = sexo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.notas = notas;
        this.media = media;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}
