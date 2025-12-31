/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.encapsulamento.pkg16.pkg10.pkg2023.pedro.luis;

/**
 *
 * @author ifpr
 */
public class Personagem extends Atributo{
    
    private String nome, classe;
    private int nivel, mana;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }   
    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public void aumentarNivel() {
    agilidade = agilidade+10;
    defesa = defesa+10;
    ataque = ataque+10;
    mana = mana+10;
    vida = vida+10;
    nivel = nivel+1;
}
}
