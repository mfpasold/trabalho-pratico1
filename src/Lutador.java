/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfpasold
 */
public class Lutador {
    
    private String nome;
    private Integer peso;
    
    public Lutador() {
    }

    public Lutador(String nome, Integer peso) {
        this.nome = nome;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    public String imprimir() {
        return "O lutador " + nome + " está na categoria peso " + getCategoria(getPeso());
    }

    private String getCategoria(Integer peso1) {
        if(peso1 > 0 && peso1 <= 54) {
            return "Pluma";
        }else if(peso1 > 54 && peso1 <= 60) {
            return "Leve";
        }else if(peso1 > 60 && peso1 <= 75) {
            return "Meio-leve";
        }else if(peso1 > 75) {
            return "Pesado";
        }else {
            return "";
        }
    }
    
    
}
