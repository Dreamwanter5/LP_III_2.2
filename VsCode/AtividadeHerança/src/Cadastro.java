
public class Cadastro {

    public static void main(String[] args) {
        
           
        Funcionario f = new Funcionario();
        
        f.cpf = "141.112.999-70";
        f.rg = "15.709.111-50";
        f.salario = 50;
        f.nome = "Patrick Queiroz";
        f.idade = 12;
        f.empresa = "Shein";
        f.telefone = "43996877150";
        f.cargo = "Costureiro";

        Funcionario f1 = new Funcionario();

        f1.cpf = "141.191.101-60";
        f1.rg = "19.203.596-2";
        f1.salario = 2000;
        f1.nome = "Maria Eduarda Leme";
        f1.empresa = "IFPR";
        f1.telefone = "92 9340395503";
        f1.idade = 20;
        f1.cargo = "Estagiaria";


        Funcionario f2 = new Funcionario();

        f2.cpf = "027.014.205-50";
        f2.rg = "19.203.395-59";
        f2.salario = 6000;
        f2.nome = "Jiavara Joana Julia";
        f2.empresa = "Welk Entertainement";
        f2.telefone = "92 9340806433";
        f2.idade = 35;
        f2.cargo = "Assistente Audiovisual";

        Funcionario f3 = new Funcionario();

        f3.cpf = "964.299.269-60";
        f3.rg = "13.246.294-2";
        f3.salario = 10000;
        f3.nome = "Douglas Ronaldo Garingue";
        f3.empresa = "Shopee";
        f3.telefone = "92 8652356703";
        f3.idade = 16;
        f3.cargo = "Tio da limpeza";

        System.out.println("Funcionário 1: " + f.nome + "\nCPF: " + f.cpf + "\nRG: " + f.rg + "\nIdade: " + f.salario + "\nEmpresa: " + f.empresa + "\nTelefone: " + f.telefone + 
        "\nCargo: " + f.cargo + "\nIdade: " + f.idade);

        System.out.println("Funcionário 1: " + f1.nome + "\nCPF: " + f1.cpf + "\nRG: " + f1.rg + "\nIdade: " + f1.salario + "\nEmpresa: " + f1.empresa + "\nTelefone: " + f1.telefone + 
        "\nCargo: " + f1.cargo + "\nIdade: " + f1.idade);

        System.out.println("Funcionário 1: " + f2.nome + "\nCPF: " + f2.cpf + "\nRG: " + f2.rg + "\nIdade: " + f2.salario + "\nEmpresa: " + f2.empresa + "\nTelefone: " + f2.telefone + 
        "\nCargo: " + f2.cargo + "\nIdade: " + f2.idade);

        System.out.println("Funcionário 1: " + f3.nome + "\nCPF: " + f3.cpf + "\nRG: " + f3.rg + "\nIdade: " + f3.salario + "\nEmpresa: " + f3.empresa + "\nTelefone: " + f3.telefone + 
        "\nCargo: " + f3.cargo + "\nIdade: " + f3.idade);
   }

}
