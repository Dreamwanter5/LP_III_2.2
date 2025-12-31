public class A_Pratica {
    public static void main(String[] args) {
    A_ProdutoDigital apd1 = new A_ProdutoDigital();    
    A_ProdutoFisico apf1 = new A_ProdutoFisico();

    //Produto Físico:
    apf1.nome = "Detergente";
    apf1.peso = 500;
    apf1.preco = 20.90;

    //Produto Digital:
    apd1.nome = "God of War: Ragnarook. digital edition";
    apd1.preco = 300.99;
    apd1.serial = "9503-3964-9tf5-129f";

    //Demonstração

    System.out.println("Produto Físico: "+apf1.nome+"\nPeso do produto: "+apf1.peso+"\nPreço: "+apf1.preco);
    System.out.println("Produto Digital: "+apd1.nome+"\nSerial do Produto: "+apd1.serial+"\nPreço: "+apd1.preco);
    }
    
}
