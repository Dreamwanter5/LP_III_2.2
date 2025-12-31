/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atv2;

/**
 *
 * @author Theo
 */
public class Escolha
{
    String resposta, clima, opcao;
    
    public String escolha() {
        if (resposta.equalsIgnoreCase("Esportes")&&clima.equalsIgnoreCase("Ensolarado")){
        opcao = "Evento esportivo na cidade";
        return opcao;
        
    } else if (resposta.equalsIgnoreCase("Esportes")&&clima.equalsIgnoreCase("Chuvoso")){
        opcao = "Assistir o evento esportivo na TV";
        return opcao;
    } else if (resposta.equalsIgnoreCase("Arte")&&clima.equalsIgnoreCase("Ensolarado")){
        opcao = "Teatro ao ar livre";
        return opcao;
    } else {
        opcao = "Assitir o filme/teatro pela Tv";
        return opcao;
}
    
    
}
