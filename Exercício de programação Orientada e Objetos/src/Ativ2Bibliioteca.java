public class Ativ2Bibliioteca {
    public static void main(String[] args) {
        
        ativ2Autor a2autor = new ativ2Autor();
        ativ2Editora a2editora = new ativ2Editora();
        Ativ2Livro a2Livro = new Ativ2Livro();

        a2autor.nome = "Christopher Larkin";
        a2autor.email = "Larkin023@gmail.com";

        a2editora.editora = "Team Cherry";
        a2editora.telefone = "43996877150";

        a2Livro.ISBN = "202010201997";
        a2Livro.anoDePublicacao = "2017-02-17";
        a2Livro.titulo = "Hollow Knight";
        a2Livro.quantidade = 980;

        ativ2Autor a2autor1 = new ativ2Autor();
        ativ2Editora a2editora1 = new ativ2Editora();
        Ativ2Livro a2Livro1 = new Ativ2Livro();

        a2autor1.nome = "Cellbit";
        a2autor1.email = "Cellbit@gmail.com";

        a2editora1.editora = "Dumativa";
        a2editora1.telefone = "436148253";

        a2Livro1.ISBN = "103756939561";
        a2Livro1.anoDePublicacao = "2020-40-90";
        a2Livro1.titulo = "Hollow Knight: Silksong";
        a2Livro1.quantidade = 3;

        ativ2Autor a2autor2 = new ativ2Autor();
        ativ2Editora a2editora2 = new ativ2Editora();
        Ativ2Livro a2Livro2 = new Ativ2Livro();

        a2autor2.nome = "Patrick";
        a2autor2.email = "QueirozMar@gmail.com";

        a2editora2.editora = "IFPR";
        a2editora2.telefone = "43859265932";

        a2Livro2.ISBN = "54689172648851";
        a2Livro2.anoDePublicacao = "2023-07-08";
        a2Livro2.titulo = "Vida de inseto";
        a2Livro2.quantidade = 500;

        ativ2Autor a2autor3 = new ativ2Autor();
        ativ2Editora a2editora3 = new ativ2Editora();
        Ativ2Livro a2Livro3 = new Ativ2Livro();

        a2autor.nome = "Karl Marx";
        a2autor.email = "xraMlraK@gmail.com";

        a2editora.editora = "Boitempo";
        a2editora.telefone = "429472912223";

        a2Livro.ISBN = "9378501748493758";
        a2Livro.anoDePublicacao = "1924-02-20";
        a2Livro.titulo = "Manifesto do Partido Comunista";
        a2Livro.quantidade = 2000;


        System.out.println("Livro: " + a2Livro.titulo + "\nAutor: " + a2autor.nome + "\nAno de Publicação: " + a2Livro.anoDePublicacao + "\nEditora: " + a2editora.editora +
        "\nContato da Editora: " + a2editora.telefone + "\nContato do autor: " + a2autor.email + "\nISBN: " + a2Livro.ISBN + "\nQuantidade: " + a2Livro.quantidade);
        
         System.out.println("Livro: " + a2Livro1.titulo + "\nAutor: " + a2autor1.nome + "\nAno de Publicação: " + a2Livro1.anoDePublicacao + "\nEditora: " + a2editora1.editora +
        "\nContato da Editora: " + a2editora1.telefone + "\nContato do autor: " + a2autor1.email + "\nISBN: " + a2Livro1.ISBN + "\nQuantidade: " + a2Livro1.quantidade);
        
         System.out.println("Livro: " + a2Livro2.titulo + "\nAutor: " + a2autor2.nome + "\nAno de Publicação: " + a2Livro2.anoDePublicacao + "\nEditora: " + a2editora2.editora +
        "\nContato da Editora: " + a2editora2.telefone + "\nContato do autor: " + a2autor2.email + "\nISBN: " + a2Livro2.ISBN + "\nQuantidade: " + a2Livro2.quantidade);
        
         System.out.println("Livro: " + a2Livro3.titulo + "\nAutor: " + a2autor3.nome + "\nAno de Publicação: " + a2Livro3.anoDePublicacao + "\nEditora: " + a2editora3.editora +
        "\nContato da Editora: " + a2editora3.telefone + "\nContato do autor: " + a2autor3.email + "\nISBN: " + a2Livro3.ISBN + "\nQuantidade: " + a2Livro3.quantidade);
        
        


    }
    
}
