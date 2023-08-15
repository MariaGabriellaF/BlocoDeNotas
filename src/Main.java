import entidades.Anotacoes;
import entidades.BlocoDeNotas;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selecionar;
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        boolean sairDoPrograma = false;

        while(sairDoPrograma == false){
            System.out.println("Digite:\n1.Para criação de um bloco de notas;\n2.Para pesquisar uma anotação ja existente;\n3.Para editar uma anotação;\n4.Excluir uma anotação;\n5.Para sair.");
            selecionar = sc.nextInt();
            sc.nextLine();
            if (selecionar==5){
                sairDoPrograma = true;
                System.out.println("Programa encerrado.");
            }
            while (selecionar !=1 && selecionar !=2 && selecionar !=3 && selecionar !=4 && selecionar !=5){
                System.out.println("Erro! Digite um número válido.");
                System.out.println("Digite:\n1.Para criação de um bloco de notas;\n2.Para pesquisar uma anotação ja existente;\n3.Para editar uma anotação;\n4.Excluir uma anotação;\n5.Para sair.");
                selecionar = sc.nextInt();
            if (selecionar==5){
                sairDoPrograma = true;
                System.out.println("Programa encerrado.");
            }


        }
            switch(selecionar){
                case 1:
                    System.out.println("Digite seu texto.");
                    String texto = sc.nextLine();
                    Anotacoes adcionarNovaAnotacao = new Anotacoes(texto);
                    blocoDeNotas.novaAnotacao(adcionarNovaAnotacao);
                    break;
                case 2:
                    System.out.println("Digite o que você deseja pesquisar: ");
                    String textoParaPesquisar = sc.nextLine();
                    blocoDeNotas.pesquisar(textoParaPesquisar);
                    break;
                case 3:
                    blocoDeNotas.todasAnotacoes();
                    System.out.println("Digite o número da anotação que deseja editar: ");
                    int numeroEditar = sc.nextInt();
                    blocoDeNotas.editar(numeroEditar);
                    break;
                case 4:
                    blocoDeNotas.todasAnotacoes();
                    System.out.println("Digite o número da anotação que deseja apagar: ");
                    int numeroParaApagar = sc.nextInt();
                    blocoDeNotas.apagar(numeroParaApagar);
                    break;
                case 5:
                    sairDoPrograma = true;
                    break;
                default:
                    break;
            }


        }





        sc.close();

    }
}