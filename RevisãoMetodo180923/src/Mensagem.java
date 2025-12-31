/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ifpr
 */
public class Mensagem {
    
    String mensagem;
    
    //usualmente métodos são públicos, o que isso significa? Significa que posso 
    //utilizá-los em diversas classes, ele não se prende a uma só
    //métodos void não precisam de retorno
    public void saudacao(){
        System.out.println("Olá, mundo");
    }
    
    //A nomenclatura de um método, geralmente começa com um verbo
    // alguns métodoso possuem argumentos/parâmetros
    //Parâmetros são geralmente colocados em parênteses e são informações
    // que um método irá receber para executar determinada tarefa.
    public void ExibirMensagem(String Mensagem){
        System.out.println("Mensagem");   
    }
}
