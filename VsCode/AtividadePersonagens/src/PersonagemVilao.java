public class PersonagemVilao {

    public static void main(String[] args) {
        
        PVStatus pv1 = new PVStatus();
        PVStatus pv2 = new PVStatus();
        PVStatus pv3 = new PVStatus();

        pv1.nVilão = "Pyramid Head";
        pv1.NomeFranquia = "Silent Hill";
        pv1.Classe = "Bárbaro";
        pv1.pforça = 90;
        pv1.ptAgilidade = 40;
        pv1.pInteligencia = 20;
        pv1.ptVida = 80;

        pv2.nVilão = "Mr. X";
        pv2.NomeFranquia = "Resident Evil";
        pv2.Classe = "Guerreiro";
        pv2.pforça = 60;
        pv2.ptAgilidade = 50;
        pv2.pInteligencia = 80;
        pv2.ptVida = 40;

        pv3.nVilão = "Kerrigan";
        pv3.NomeFranquia = "Starcraft";
        pv3.Classe = "Assassino";
        pv3.pforça = 50;
        pv3.ptAgilidade = 90;
        pv3.pInteligencia = 40;
        pv3.ptVida = 30;

        System.out.println(pv1.nVilão);
        System.out.println(pv1.NomeFranquia);
        System.out.println(pv1.Classe);
        System.out.println(pv1.ptAgilidade);
        System.out.println(pv1.pforça);
        System.out.println(pv1.ptVida);
        System.out.println(pv1.pInteligencia);

        System.out.println(pv2.nVilão);
        System.out.println(pv2.NomeFranquia);
        System.out.println(pv2.Classe);
        System.out.println(pv2.ptAgilidade);
        System.out.println(pv2.pforça);
        System.out.println(pv2.ptVida);
        System.out.println(pv2.pInteligencia);
        
        System.out.println(pv3.nVilão);
        System.out.println(pv3.NomeFranquia);
        System.out.println(pv3.Classe);
        System.out.println(pv3.ptAgilidade);
        System.out.println(pv3.pforça);
        System.out.println(pv3.ptVida);
        System.out.println(pv3.pInteligencia);
    // String nVilão;
    //String NomeFranquia;
    //String Classe;
    //int pforça;
    //int pInteligencia;
    //int ptAgilidade;
    }
}
