/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ifpr
 */
public class Calculo {
    //Métodos que não são void devem retornar ao final
    //algo que não seja do tipo do método.
    // Por exemplo, um método do tipo int retorno no final um valor que seja do seu tipo.
    public int somar (int n1, int n2){
        int soma = n1+n2;
        return soma;
    }
    
    public int subtrair (int n1,int n2){
        int subtracao = n1 - n2;
        return subtracao;
    }
    public int Multiplicacao (int n1,int n2){
        int multiplicacao = n1 * n2;
        return multiplicacao;
    }
    
    public int divicao (int n1,int n2){
        int divicao = n1 / n2;
        return divicao;
    }
}
