package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public class Anotacoes {
    public static Scanner sc = new Scanner(System.in);

    private int numero;
    private String texto;
    private boolean removido;
    private LocalDate dataDeCriacao;

    public Anotacoes(String textoDoUsuario){
        texto = textoDoUsuario;
        removido = false;
        dataDeCriacao = LocalDate.now();
    }

    public void editarTexto(){
        System.out.println(texto);
        System.out.println("Digite o novo texto para edição: ");
        texto = sc.nextLine();
    }

    public String getTexto(){
        return texto;
    }
    public int getNumero(){
        return numero;
    }
    public void remover(){
        removido = true;
    }
    public boolean getApagada(){
        return removido;
    }
    public void setNumero(int numeroAnotacao){
        numero = numeroAnotacao;
    }

    public LocalDate getDataDeCriacao(){
        return dataDeCriacao;
    }






}
