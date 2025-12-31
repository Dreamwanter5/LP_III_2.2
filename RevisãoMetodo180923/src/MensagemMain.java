/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ifpr
 */
public class MensagemMain {
    //Qualquer execução de um método deve ocorrer dentro de um método principal
    

    
    public static void main(String[] args) {
    //Neste caso, é necessário criar um objeto do tipo
    //mensagem para acessar o método em sua classe de origem
    Mensagem m = new Mensagem();
    
    m.saudacao();
    
    m.mensagem = "IFPR 2023";
    
    m.ExibirMensagem(m.mensagem);
    }
    
}
