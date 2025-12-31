public class D_Pratica {
    public static void main(String[] args) {
        D_Ebook ebo = new D_Ebook();
        D_LivroFisico fis = new D_LivroFisico();

        //Ebook
        ebo.anoDePublicacao = 1893;
        ebo.autor = "Friedrich Niezstche";
        ebo.tamanhoMb = 50;
        ebo.titulo = "Entre o bem e o Mal";

        //livro fisco
        fis.anoDePublicacao = 0;
        fis.autor = "Varios";
        fis.numPaginas = 600;
        fis.titulo ="Bíblia";

        //pratica

        System.out.println("titulo ebook: "+ebo.titulo+"\nautor ebook: "+ebo.autor+"\nTamanho em MB: "+ebo.tamanhoMb+"\nAutor: "+ebo.autor);
        System.out.println("titulo Livro: "+fis.titulo+"\nautor Livro: "+fis.autor+"\nNúmero de Páginas: "+fis.numPaginas+"\nAutor: "+fis.autor);
    }
}
