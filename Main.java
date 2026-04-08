import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        int tentativas2 = 0;

        String email = "carloseduardolopes786@gmail.com";
        int password = 1234;

        System.out.println("Digite seu email: ");
        String input = sc.nextLine();

        while (!email.equals(input)) {
            System.out.println("Email invalido! digite novamente: ");
            input = sc.nextLine();
        }

        System.out.println("Digite senha");
        int input2 = sc.nextInt();

        while ((input2 != password) && tentativas < 3) {
            tentativas++;

            System.out.println("Senha inválida! Tentativa " + tentativas + "/3");

            if (tentativas == 3) {
                System.out.println("Acesso bloqueado!");
                sc.close();
                return;
            }

            System.out.println("Digite a senha novamente");
            input2 = sc.nextInt();
        }

        System.out.println("Login feito com sucesso!");

        System.out.println("Bem vindo! Escolha uma opcao do nosso menu: ");

        System.out.println("-----MENU------");
        System.out.println("1- Comida");
        System.out.println("2- Bebidas");
        System.out.println("3- Sair");

        System.out.println("Escolha uma opcao: ");
        int opcao = sc.nextInt();

       
        int tentativasMenu = 0;

        while ((opcao < 1 || opcao > 3) && tentativasMenu < 3) {
            tentativasMenu++;

            System.out.println("Opção inválida! Tentativa " + tentativasMenu + "/3");

            if (tentativasMenu == 3) {
                System.out.println("Acesso Bloqueado!");
                sc.close();
                return;
            }

            System.out.println("Digite novamente:");
            opcao = sc.nextInt();
        }

        if (opcao == 1) {
            System.out.println("-----MENU COMIDAS-----");
            System.out.println("1- Lasanha");
            System.out.println("2- Carne de sol");
            System.out.println("3- Hamburguer");

            int escolha = sc.nextInt();
            tentativas2 = 0;

            while ((escolha < 1 || escolha > 3) && tentativas2 < 3) {
                tentativas2++;

                System.out.println("Opção inválida! Tentativa " + tentativas2 + "/3");

                if (tentativas2 == 3) {
                    System.out.println("Acesso bloqueado!");
                    break;
                }

                System.out.println("Digite novamente:");
                escolha = sc.nextInt();
            }

            if (escolha == 1) {
                System.out.println("Você escolheu Lasanha!");
            } else if (escolha == 2) {
                System.out.println("Você escolheu Carne de sol!");
            } else if (escolha == 3) {
                System.out.println("Você escolheu Hambúrguer!");
            }

        } else if (opcao == 2) {
            System.out.println("-----MENU BEBIDAS-----");
            System.out.println("4- Cerveja");
            System.out.println("5- Whisky");
            System.out.println("6- Vinho");

            int escolha = sc.nextInt();
            tentativas2 = 0;

            while ((escolha < 4 || escolha > 6) && tentativas2 < 3) {
                tentativas2++;

                System.out.println("Opção inválida! Tentativa " + tentativas2 + "/3");

                if (tentativas2 == 3) {
                    System.out.println("Acesso bloqueado!");
                    break;
                }

                System.out.println("Digite novamente:");
                escolha = sc.nextInt();
            }

            if (escolha == 4) {
                System.out.println("Você escolheu Cerveja!");
            } else if (escolha == 5) {
                System.out.println("Você escolheu Whisky!");
            } else if (escolha == 6) {
                System.out.println("Você escolheu Vinho!");
            }

        } else {
            System.out.println("Saindo...");
        }

        sc.close();
    }
}
