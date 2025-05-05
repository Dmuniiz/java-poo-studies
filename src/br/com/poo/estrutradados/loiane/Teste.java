package br.com.poo.estrutradados.loiane;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Lista<Contato> listaDecontatos = new Lista<Contato>(20);

        int menu = 1;

        while(menu != 0){
           menu = obterOpcaoMenu(scan);

           switch (menu){
               case 1:
                   adicionarContatoFinal(scan, listaDecontatos);
                   break;
               case 2:
                   adicionarContatoPosicao(scan, listaDecontatos);
                   break;
               case 3:
                    obtemContatoPosicao(scan, listaDecontatos);
                    break;
               case 4:
                   excluirPorPosicao(scan, listaDecontatos);
                   break;
               case 5:
                    verificaTamanhoVetor(listaDecontatos);
                   break;
               case 6:
                   excluirTodosContatos(listaDecontatos);
                   break;
               case 7:
                   System.out.println(listaDecontatos);
                   break;
               default:
                   break;
           }

        }
        System.out.println("Usuário digito");

    }

    private static void excluirTodosContatos(Lista<Contato> lista){
        lista.limpar();
        System.out.println("Todos os contatos foram excluidos");
    }

    private static void verificaTamanhoVetor(Lista<Contato> lista){
        System.out.println("O tamanho do vetor é: "+ lista.tamanho());
    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

        try{
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluído");

        }catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

        try{
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);
        }catch (Exception e){
            System.out.println("Posição inválida");
        }

    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações:");
        String nome = lerInformacao("Entre com o nome: ", scan);
        String telefone = lerInformacao("Entre com o telefone: ", scan);
        String email = lerInformacao("Entre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição para adicionar o contato: ", scan);

        lista.adiciona(pos, contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }


    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações:");
        String nome = lerInformacao("Entre com o nome: ", scan);
        String telefone = lerInformacao("Entre com o telefone: ", scan);
        String email = lerInformacao("Entre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static int lerInformacaoInt(String msg, Scanner scan) {
        boolean entradaValida = false;
        int num = 0;

        while(!entradaValida){
            try{
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);
                entradaValida = true;
            }catch (Exception e){
                System.out.println("Entrada inválida, digite novamente");
            }
        }
        return num;
    }

    private static String lerInformacao(String msg, Scanner scan){
        System.out.println(msg);//imprime a mensagem que é passada no parametro
        String entrada = scan.nextLine();//le o valor

        return entrada;//retorna o valor adicionando no construtor
    }

    private static int obterOpcaoMenu(Scanner scan){
        boolean entradaValida = false;
        int opcao = -1;
        String entrada;

        //inversor
        while(!entradaValida){
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Excluir por posição");
            System.out.println("5: Verifica tamanho do vetor");
            System.out.println("6: Excluir todos os contatos do vetor");
            System.out.println("7: Imprime vetor");
            System.out.println("0: Sair");

            try{
                entrada = scan.nextLine();
                //string para inteiro
                opcao = Integer.parseInt(entrada);


                //de 0 até 7
                if(opcao >= 0 && opcao <= 7){
                    entradaValida = true; // sai do while
                }else{
                    //lanca excecao
                    throw new Exception();
                }

            }catch (Exception e){
                System.out.println("Entrada inválida, digite novamente: \n\n");
            }
        }
        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){

        Contato contato;
        for(int i = 1; i <= quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato"+i+"@email.com");

            lista.adiciona(contato);
        }


    }

}
