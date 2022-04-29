/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunocmc
 */
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;
    
    // Construtor

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        
        
    }

    // Metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
        
    public double calcularIrpf() {
        double aux = 0;
        if (salario <= 1903) {
            aux = 0.0;
        } else if (salario >= 1903 && salario < 2826) {
            aux = 0.075 * salario;
        } else if (salario >= 2826 && salario < 3751) {
            aux = 0.15 * salario;
        } else if (salario >= 3751 && salario < 4664) {
            aux = 0.225 * salario;
        } else if (salario > 4664) {
            aux = 0.275 * salario;
        }
        return aux;
    }
   
    public double calcularInss() {
       if (salario <= 1903) {
            salario = -(0.0 * salario) + salario;
        } else if (salario >= 1903 && salario < 2826) {
            salario = -(0.075 * salario) + salario;
        } else if (salario >= 2826 && salario < 3751) {
            salario = -(0.15 * salario) + salario;
        } else if (salario >= 3751 && salario < 4664) {
            salario = -(0.225 * salario) + salario;
        } else if (salario > 4664) {
            salario = -(0.275 * salario) + salario;
        }
        return (salario);
    }
    
}


