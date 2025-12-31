/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.encapsulamento.pkg16.pkg10.pkg2023.pedro.luis;

/**
 *
 * @author ifpr
 */
public class Habilidades {

    
    //O encapsulamento oculha detalhes da implementação da classe (atributos privados)
    // O Atributo permanece privado, porém você tem uma forma de acessá-lo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }
    private String nome;
    private int danoBase, custoMana;
}
