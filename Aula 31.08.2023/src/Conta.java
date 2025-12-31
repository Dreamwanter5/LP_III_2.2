/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ifpr
 */
public class Conta {
        String titular;
        String nrConta;
        double saldo;
        //O metodo void é o metodo mais simples. Designado para execuções rápidas e simples.
        //os métodos necessitam de ser públicos para que possam ser acessados na posterioridade por outras classes.
        public void exibirMensagem(){ 
            System.out.println("Seja Bem-Vindo: "+titular);
        }
        
        //Ser _public_ permite puxar o método para vários códigos.
        //"()" é o que é chamado de ARGUMENTO, ele é uma condição que precisa ser atendida para o Public funcionar
        public double depositar(double valor){
            saldo = saldo+valor;
            return saldo;
            
            //Todo metodo que NAO seja VOID precisa de um retorno.
        }
        
        public double sacar(double valor){
            saldo = saldo-valor;
            return saldo;
            
        }
        //Agora estabelece o método para sacar, para ser utilizado em outras classes.
}
