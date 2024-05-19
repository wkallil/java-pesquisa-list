//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("Livro 1", "autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "autor 3", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "autor 4", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "autor 1", 1993);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));



    }
}