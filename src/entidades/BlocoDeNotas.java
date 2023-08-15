package entidades;

import entidades.Anotacoes;

import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<Anotacoes> listaAnotacoes = new ArrayList<>();

    public void novaAnotacao (Anotacoes adicionarNovaAnotacao){
        listaAnotacoes.add(adicionarNovaAnotacao);
        adicionarNovaAnotacao.setNumero(listaAnotacoes.indexOf(adicionarNovaAnotacao));
    }

    public void editar (int numero){
        Anotacoes anotacaoQueSeraEditada = listaAnotacoes.get(numero);
        anotacaoQueSeraEditada.editarTexto();
    }

    public void apagar(int numero){
        Anotacoes anotacaoQueSeraRemovida = listaAnotacoes.get(numero);
        anotacaoQueSeraRemovida.remover();
    }

    public void pesquisar(String palavraPesquisada){
        for (int i = 0; i<listaAnotacoes.size(); i++){
            if(listaAnotacoes.get(i).getTexto().contains(palavraPesquisada) && !listaAnotacoes.get(i).getApagada()){
                System.out.println(listaAnotacoes.get(i).getNumero());
                System.out.println(" " + listaAnotacoes.get(i).getTexto());
                System.out.println(" " + listaAnotacoes.get(i).getDataDeCriacao());

            }

        }

    }
    public void todasAnotacoes(){
        for (int i = 0 ; i< listaAnotacoes.size(); i++){
            Anotacoes anotacao = listaAnotacoes.get(i);
            if(!anotacao.getApagada()){
                System.out.println(anotacao.getNumero());
                System.out.println(" " + anotacao.getTexto());
                System.out.println(" " + anotacao.getDataDeCriacao());
            }
        }
    }


}
