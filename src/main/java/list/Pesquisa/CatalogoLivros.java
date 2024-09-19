package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrolist;

    public CatalogoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorAno = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l: livrolist){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorAno.add(l);
                }
            }
        }
        return livroPorAno;
    }

    public Livro pesqusiaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor1",2000);
        catalogoLivros.adicionarLivro("Livro1", "Autor2",2001);
        catalogoLivros.adicionarLivro("Livro2", "Autor2",2002);
        catalogoLivros.adicionarLivro("Livro3", "Autor3",2003);
        catalogoLivros.adicionarLivro("Livro4", "Autor4",2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000,2002));
        System.out.println(catalogoLivros.pesqusiaPorTitulo("Livro1"));
        System.out.println(catalogoLivros.pesqusiaPorTitulo("Livro3"));
    }
}
