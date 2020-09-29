package pilha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author edivan
 */
public class usaPilha {

    public static void escolhas() {
        System.out.printf("Escolha a opção:");
        System.out.printf("\n1. Inserir");
        System.out.printf("\n2. Excluir");
        System.out.printf("\n3. Exibir a Pilha");
        System.out.printf("\n4. sair");
        System.out.printf("\n Opcão :\t ");
    }

    public static void main(String[] args) {
        Pilha objPilha = new Pilha(10);
        BufferedReader entrada;
        entrada = new BufferedReader(
                new InputStreamReader(System.in));
        Object valor;
        try {
            escolhas();
            char opcao = entrada.readLine().charAt(0);
            while (opcao != '4') {
                switch (opcao) {
                    case '1':
                        if (objPilha.cheia() == false) {
                            System.out.printf("Digite algo: ");
                            valor = entrada.readLine();
                            objPilha.empilhar(valor);
                        } else {
                            System.out.println("Fila Cheia");
                        }
                        break;
                    case '2' :
                        if (objPilha.vazia() == false){
                            System.out.println(objPilha.desempilhar());
                        }
                        else{
                            System.out.println("Fila vazia");
                        }
                        break;
                    case '3' :
                        objPilha.exibePilha();
                        break;
                    default: System.out.println("Opção Invalida!");
                }
                System.out.println();
                escolhas();
                opcao = entrada.readLine().charAt(0);                
            }
        } catch (IOException erro) {
            System.out.println("Erro de Entrada de Dados");
        }
    }

}
