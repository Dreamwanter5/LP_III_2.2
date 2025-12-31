/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.encapsulamento.pkg16.pkg10.pkg2023.pedro.luis;

/**
 *
 * @author ifpr
 */
public class Pratica {
    public static void main(String[] args) {
    
        Personagem p = new Personagem();   
        Habilidades h = new Habilidades();
        Equipamento e = new Equipamento();
        Criatura c = new Criatura();
        
        
        p.setAgilidade(10);
        p.setAtaque(8);
        p.setDefesa(14);
        p.setMana(16);
        p.setNivel(1);
        p.setNome("Gale");
        p.setVida(14);
        p.setClasse ("mago");
        
        h.setCustoMana(20);
        h.setDanoBase(5);
        h.setNome("Misseis Mágicos");
        
        e.setNomeEquipamento("Cajado de Dekarius");
        e.setBonusVida(2);
        e.setBonusMana(8);
        e.setBonusDefesa(2);
        e.setBonusAtaque(0);
        e.setBonusAgilidade(0);
        
        c.setAgilidade(16);
        c.setAtaque(12);
        c.setDefesa(16);
        c.setNomeCriatura("Devorador de mentes");
        c.setTipoElemental("Psíquico");
        c.setVida(18);
        
        System.out.println("Nome do Personagem: "+ p.getNome());
        System.out.println("Classe do Personagem: "+ p.getClasse());
        System.out.println("Ataque do Personagem: : "+ p.getAtaque());
        System.out.println("Defesa do Personagem: "+ p.getDefesa());
        System.out.println("Mana do Personagem: "+ p.getMana());
        System.out.println("Nivel do Personagem: "+ p.getNivel());
        System.out.println("Vida do Personagem: "+ p.getVida());
        System.out.println("---------------------------------------------");
        
        System.out.println("Nome da Ciratura: "+ c.getNomeCriatura());
        System.out.println("Ataque da Criatura: "+ c.getAtaque());
        System.out.println("Defesa da Criatura: "+ c.getDefesa());
        System.out.println("Agilidade da Criatura: "+ c.getAgilidade());
        System.out.println("Tipo Elemental: "+ c.getTipoElemental());
        System.out.println("Vida da Criatura: "+ c.getVida());
        System.out.println("---------------------------------------------");
        
        System.out.println("Nome do Equipamento: "+ e.getNomeEquipamento());
        System.out.println("Bônus de vida: "+ e.getBonusVida());
        System.out.println("Bonus de Mana: "+ e.getBonusMana());
        System.out.println("Bonus de Ataque: "+ e.getBonusAtaque());
        System.out.println("Bonus de Defesa: "+ e.getBonusDefesa());
        System.out.println("Bônus de agilidade: "+ e.getBonusAgilidade());
        System.out.println("---------------------------------------------");
        
        System.out.println("Nome da Habilidade: "+ h.getNome());
        System.out.println("Dano da Habilidade: "+ h.getDanoBase());
        System.out.println("Custo de Mana de Habilidade: "+ h.getCustoMana());
        System.out.println("---------------------------------------------");
        
        p.aumentarNivel();
        
                
        System.out.println("Nome do Personagem: "+ p.getNome());
        System.out.println("Classe do Personagem: "+ p.getClasse());
        System.out.println("Ataque do Personagem: : "+ p.getAtaque());
        System.out.println("Defesa do Personagem: "+ p.getDefesa());
        System.out.println("Mana do Personagem: "+ p.getMana());
        System.out.println("Nivel do Personagem: "+ p.getNivel());
        System.out.println("Vida do Personagem: "+ p.getVida());
        System.out.println("---------------------------------------------");
        
    }
 
    

}
