/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ifpr
 */
public class atv3Aluno {
    //B = biologia
    // M = Matemática
    // P = Portugues
    
    Double bNota1, bNota2, bNota3, bMedia,
            mNota1, mNota2, mNota3, mMedia,
             pNota1, pNota2, pNota3, pMedia;
    
   
    
    String resultadob, resultadom, resultadop;
    
    
    public String ExibirMediaB(){
        if (bMedia>= 7){
            resultadob = "Aprovado";
            return resultadob;
        }
            else {
            resultadob = "Reprovado";
            return resultadob;
            }
    }
    
    public String ExibirMediaM(){
        if (mMedia>= 7){
            resultadom = "Aprovado";
            return resultadom;
        }
            else {
            resultadom = "Reprovado";
            return resultadom;
            }
    }
    
    public String ExibirMediaP(){
        if (pMedia>= 7){
            resultadop = "Aprovado";
            return resultadop;
        }
            else {
            resultadop = "Reprovado";
            return resultadop;
            }
    }

}


