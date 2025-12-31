public class Ativ3GerenciamentoEventos {
    public static void main(String[] args) {
        ativ3Local a3l = new ativ3Local();
        Ativ3Participante a3p = new Ativ3Participante();
        Ativ3Evento a3e = new Ativ3Evento();

        a3l.Local = "IFPR - Campus de Jacarezinho";
        a3l.capacidade = 600;

        a3p.email = "Patrickmarquezqueiroz@hotmail.com";
        a3p.nome = "Douglas";
        a3p.telefone = "+55 43 1978056295729";

        a3e.nome = "S3pin";

        System.out.println("Evento: " +a3e.nome+ "\nLocal: "+a3l.Local+"\nCapacidade: "+a3l.capacidade+"\nParticipante: "+a3p.nome+"\nE-Mail: "+a3p.email+"Telefone: "+a3p.telefone);

        ativ3Local a3l1 = new ativ3Local();
        Ativ3Participante a3p1 = new Ativ3Participante();
        Ativ3Evento a3e1 = new Ativ3Evento();

        a3l1.Local = "Paredão das drogas";
        a3l1.capacidade = 50;

        a3p1.email = "MariaEduardaLeme@yahoo.com.br";
        a3p1.nome = "Lemes";
        a3p1.telefone = "+55 43 285948332";

        a3e1.nome = "64º Reunião anual do paredão das drogas";

        System.out.println("Evento: " +a3e1.nome+ "\nLocal: "+a3l1.Local+"\nCapacidade: "+a3l1.capacidade+"\nParticipante: "+a3p1.nome+"\nE-Mail: "+a3p1.email+"Telefone: "+a3p1.telefone);

        
        ativ3Local a3l2 = new ativ3Local();
        Ativ3Participante a3p2 = new Ativ3Participante();
        Ativ3Evento a3e2 = new Ativ3Evento();

        a3l2.Local = "Casa do Douglas";
        a3l2.capacidade = 150;

        a3p2.email = "Douglasanaogenio@gmail.com";
        a3p2.nome = "Douglas <3";
        a3p2.telefone = "+55 43 6295729";

        a3e2.nome = "Baladinha anual do Douglas";

        System.out.println("Evento: " +a3e2.nome+ "\nLocal: "+a3l2.Local+"\nCapacidade: "+a3l2.capacidade+"\nParticipante: "+a3p2.nome+"\nE-Mail: "+a3p2.email+"Telefone: "+a3p2.telefone);

        
        ativ3Local a3l3 = new ativ3Local();
        Ativ3Participante a3p3 = new Ativ3Participante();
        Ativ3Evento a3e3 = new Ativ3Evento();

        a3l.Local = "Manicômio";
        a3l.capacidade = 1000000000;

        a3p.email = "pedro.luis.borges.o@gmail.com";
        a3p.nome = "Pedro Luis";
        a3p.telefone = "+55 43 996877150";

        a3e.nome = "Linguagem de programação III";

        System.out.println("Evento: " +a3e3.nome+ "\nLocal: "+a3l3.Local+"\nCapacidade: "+a3l3.capacidade+"\nParticipante: "+a3p3.nome+"\nE-Mail: "+a3p3.email+"Telefone: "+a3p3.telefone);

        

    }
}
