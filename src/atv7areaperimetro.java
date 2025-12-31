/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Theo
 */
public class atv7areaperimetro {
    String escolha;
    
    public int areaTriangulo (int lado1, int lado2){
        int resultado = (lado1*lado2)/2;
        return resultado;
    }
    
    public int perimetroTriangulo (int lado1, int lado2, int lado3){
        int resultado = lado1+lado2+lado3;
        return resultado;
    }
    
    //Square
    public int areaQuadrado (int base, int altura){
        int resultado = base*altura;
        return resultado;
    }
    
    public int perimetroQuadrado (int lado1, int lado2, int lado3, int lado4){
        int resultado = lado1+lado2+lado3+lado4;
        return resultado;
    }
    
    // Retângulo
    public int areaRetangulo (int base, int altura){
        int resultado = base*altura;
        return resultado;
    }
    
    public int perimetroRetangulo (int lado1, int lado2, int lado3, int lado4){
        int resultado = lado1+lado2+lado3+lado4;
        return resultado;
    }
    
    //Trapezio
    public int areaTrapezio (int baseMaior, int baseMenor, int altura){
        int resultado = ((baseMaior+baseMenor)*altura)/2;
        return resultado;
    }
    
    public int perimetroTrapezio (int lado1, int lado2, int lado3){
        int resultado = lado1+lado2+lado3;
        return resultado;
    }
    
    
    
    
}
