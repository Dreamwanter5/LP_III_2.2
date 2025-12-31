/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ifpr
 */
public class atv1Filme {
 String genero, titulo;
 
 public String recomendar(){
     
    //equalsIgnoreCase ignora se a pessoa vai digitar em minúsculo ou maiúsculo.
    //Equals serve para comparar String's
    if(genero.equalsIgnoreCase( "ação")){
    
        titulo = "Minions";
        return titulo;
    
    }   else if (genero.equalsIgnoreCase("Aventura")){
            titulo = "Moana";
            return titulo;
            
    }   else if (genero.equalsIgnoreCase("Terror")){
            titulo = "Halloween";
            return titulo;
    }   else if (genero.equalsIgnoreCase("Comédia")){
            titulo = "As branquelas";
            return titulo;
    }   else if (genero.equalsIgnoreCase("Drama")){
            titulo = "La La Land";
            return titulo;
    } else{
        titulo = "Filme não econtrado";
        return titulo;
    }
    }
}
