public class ativ1Execucao {
    public static void main(String[] args) {
        
        
              
       ativ1Funcionario f1 = new ativ1Funcionario();
       ativ1Departamento d1 = new ativ1Departamento();

       ativ1Funcionario f2 = new ativ1Funcionario();
       ativ1Departamento d2 = new ativ1Departamento();

       ativ1Funcionario f3 = new ativ1Funcionario();
       ativ1Departamento d3 = new ativ1Departamento();

       ativ1Funcionario f4 = new ativ1Funcionario();
       ativ1Departamento d4 = new ativ1Departamento();

        f1.nome = "Joel";
        f1.Salário = 400;
        f1.cargo = "Estagiário";

        d1.localização = "Shibuya";
        d1.nome = "Mappa Studios";

        System.out.println("Nome: " + f1.nome + "\nCargo: " + f1.cargo + "\nSalário: " + f1.Salário + "\nLocal: "+ d1.localização);
        
        f2.nome = "Alberto";
        f2.Salário = 900;
        f2.cargo = "Físico";

        d2.localização = "Texas";
        d2.nome = "CIA";

        System.out.println("Nome: " + f2.nome + "\nCargo: " + f2.cargo + "\nSalário: " + f2.Salário + "\nLocal: "+ d1.localização);


        f3.nome = "Arife";
        f3.Salário = 20;
        f3.cargo = "Funcionário Público";

        d3.localização = "Ourinhos";
        d3.nome = "IFPR";

        System.out.println("Nome: " + f3.nome + "\nCargo: " + f3.cargo + "\nSalário: " + f3.Salário + "\nLocal: "+ d3.localização);

        f4.nome = "André";
        f4.Salário = 2019;
        f4.cargo = "Contador";

        d4.localização = "Doutor João Carvalho";
        d4.nome = "PCB";

        System.out.println("Nome: " + f4.nome + "\nCargo: " + f4.cargo + "\nSalário: " + f4.Salário + "\nLocal: "+ d4.localização);

    }
}
