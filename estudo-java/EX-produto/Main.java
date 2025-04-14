//Parte 1 - código para mantém o estoque de produtos de uma loja
//implementei tambem um menu de opções para o usuário interagir com o programa
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        Produto produto1 = new Produto(11);
        produto1.inserir("Detergente", 50, "Limpeza", 2.50);
        Produto produto2 = new Produto(21, "Arroz", 100, "Comida", 15.90);
        Produto produto3 = new Produto(12, "Sabão em pó", 30, "Limpeza", 12.75);
        Produto produto4 = new Produto(31, "Quebra-cabeça", 40, "Jogo", 18.50);
        
        int sair = 0; //controle
        
        System.out.println("=== SISTEMA DE ESTOQUE ===");
        while (sair == 0) {
            System.out.println("\n=== PRODUTOS DISPONÍVEIS ===");
            System.out.println("1. " + produto1.getInfoBasica());
            System.out.println("2. " + produto2.getInfoBasica());
            System.out.println("3. " + produto3.getInfoBasica());
            System.out.println("4. " + produto4.getInfoBasica());
            System.out.print("\nEscolha um produto (1-4) ou 0 para sair: ");
            int escolha = scanner.nextInt();
            
            if (escolha == 0) {
                sair = 1;
            } else if (escolha >= 1 && escolha <= 4) {
                Produto produtoAtual;
                if (escolha == 1)      produtoAtual = produto1;
                else if (escolha == 2) produtoAtual = produto2;
                else if (escolha == 3) produtoAtual = produto3;
                else                   produtoAtual = produto4;
                
                System.out.println("\n=== DADOS DO PRODUTO ===");
                System.out.println(produtoAtual.consultar());
                
                int operacao;
                do {
                    System.out.println("\n=== MENU DE OPERAÇÕES ===");
                    System.out.println("1. Vender");
                    System.out.println("2. Comprar (atualizando valor)");
                    System.out.println("3. Comprar (mantendo valor)");
                    System.out.println("4. Consultar produto");
                    System.out.println("5. Inserir/Atualizar dados");
                    System.out.println("6. Comparar com outro produto");
                    System.out.println("7. Voltar");
                    System.out.print("Escolha: ");
                    
                    operacao = scanner.nextInt();
                    
                    switch (operacao) {
                        case 1:
                            System.out.print("Quantidade a vender: ");
                            int venda = scanner.nextInt();
                            produtoAtual.vender(venda);
                            break;
                            
                        case 2:
                            System.out.print("Quantidade a comprar: ");
                            int compra1 = scanner.nextInt();
                            System.out.print("Novo valor unitário: R$ ");
                            double novoValor = scanner.nextDouble();
                            produtoAtual.comprar(compra1, novoValor);
                            break;
                            
                        case 3:
                            System.out.print("Quantidade a comprar: ");
                            int compra2 = scanner.nextInt();
                            produtoAtual.comprar(compra2);
                            break;
                            
                        case 4:
                            //já mostra os dados automaticamente
                            break;
                            
                        case 5:
                            scanner.nextLine();
                            System.out.print("Novo nome: ");
                            String nome = scanner.nextLine();
                            System.out.print("Nova quantidade: ");
                            int qtd = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Novo tipo: ");
                            String tipo = scanner.nextLine();
                            System.out.print("Novo valor: R$ ");
                            double valor = scanner.nextDouble();
                            
                            produtoAtual.inserir(nome, qtd, tipo, valor);
                            System.out.println("Dados atualizados com sucesso!");
                            break;
                            
                        case 6:
                            System.out.println("\n=== COMPARAR COM ===");
                            System.out.println("1. " + produto1.getInfoBasica());
                            System.out.println("2. " + produto2.getInfoBasica());
                            System.out.println("3. " + produto3.getInfoBasica());
                            System.out.println("4. " + produto4.getInfoBasica());
                            
                            System.out.print("Escolha outro produto (1-4): ");
                            int outro = scanner.nextInt();
                            
                            Produto produtoComparado;
                            if (outro == 1) {
                                produtoComparado = produto1;
                            }    
                            else if (outro == 2) {
                                produtoComparado = produto2;
                            }
                            else if (outro == 3) {
                                produtoComparado = produto3;
                            } 
                            else{
                                produtoComparado = produto4;
                            }              
                            
                            boolean iguais = produtoAtual.equals(produtoComparado);
                            System.out.println("Os produtos são iguais? " + iguais);
                            break;
                            
                        case 7:
                            break;
                            
                        default:
                            System.out.println("Opção inválida!");
                    }
                    
                    System.out.println("\n=== DADOS ATUAIS ===");
                    System.out.println(produtoAtual.consultar());
                    
                } while (operacao != 7);
            }
        }
        
        System.out.println("\n=== PROGRAMA ENCERRADO ===");
        scanner.close();
    }
}