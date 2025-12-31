/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Theo
 */
public class atv6Triangulo {
        String resposta;
    public int Calculo(int lado1, int lado2, int lado3){
        int resposta;
        if (lado1 == lado2 && lado1 == lado3){
            resposta = 1;
            
        } else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1)){
            resposta = 2;
            
        } else{
            resposta = 3;
        }
        return resposta;
    }
}
