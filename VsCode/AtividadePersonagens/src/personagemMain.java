public class personagemMain {
    public static void main(String[] args) {
            
            //Isso aqui é uma abordagem de orientação a objetos, eu consigo tornar o outro espaço na pasta como um scanner. Enquanto o outro é só um lugar que guarda as variáveis.

         Personagens p1 = new Personagens();
         p1.nomeClasse = "Mago";
         p1.nomePersonagem = "Newton";
         p1.ptAtaque = 150;
         p1.ptAgilidade = 20;
         p1.ptDefesa = 30;
        

        Personagens p2 = new Personagens();
        p2.nomeClasse = "Bárbaro";
        p2.nomePersonagem = "Medarda";
        p2.ptAtaque = 100;
        p2.ptAgilidade = 50;
        p2.ptDefesa = 60; 
          
        Personagens p3 = new Personagens();
        p3.nomeClasse = "Clérigo";
        p3.nomePersonagem = "Euterpe";
        p3.ptAtaque = 30;
        p3.ptAgilidade = 50;
        p3.ptDefesa = 80;

        System.out.println(p1.nomePersonagem);
        System.out.println(p1.nomeClasse);
        System.out.println(p1.ptAtaque);
        System.out.println(p1.ptAgilidade);
        System.out.println(p1.ptDefesa);

        
        System.out.println(p2.nomePersonagem);
        System.out.println(p2.nomeClasse);
        System.out.println(p2.ptAtaque);
        System.out.println(p2.ptAgilidade);
        System.out.println(p2.ptDefesa);

        
        System.out.println(p3.nomePersonagem);
        System.out.println(p3.nomeClasse);
        System.out.println(p3.ptAtaque);
        System.out.println(p3.ptAgilidade);
        System.out.println(p3.ptDefesa);
    }
}
