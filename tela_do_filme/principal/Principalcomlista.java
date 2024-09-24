package tela_do_filme.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import tela_do_filme.modelos.Serie;
import tela_do_filme.modelos.Titulo;
import tela_do_filme.modelos.Filme;


public class Principalcomlista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("lost", 2000);

        Filme f1 = filmeDoPaulo;


        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }

        ArrayList<String> buascarPorArtista = new ArrayList<>();
        buascarPorArtista.add("adam");
        buascarPorArtista.add("Paulo");
        buascarPorArtista.add("jacqueline");
        System.out.println(buascarPorArtista);

        Collections.sort(buascarPorArtista);
        System.out.println("Depois e ordenação");
        System.out.println(buascarPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenando por ano");
        System.out.println(lista);

    }
}
