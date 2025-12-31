/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ifpr
 */
public class ContaMain {
    public static void main(String[] args) {
        Conta c = new Conta();
        
        c.titular = "João Arruda"; 
        c.nrConta = "023592";
        //Assim o programador pode chamar o método para diferentes classes.
        c.exibirMensagem();
        //Como esse é um metodo public que precisa de um valor para funcionar, ele precisa preencher o parenteses para funcionar.
        
        System.out.println(c.depositar(300));
        
        System.out.println(c.sacar(100));
        //amem etiquetas 
        
    }
}
