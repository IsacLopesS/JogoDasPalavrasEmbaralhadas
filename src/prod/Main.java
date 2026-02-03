package prod;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void menu(){
        System.out.println("Escolha a mecânica do jogo:");
        System.out.println("mecanica1: jogue até perder 3 vidas - cada acerto contabiliza 10 pontos");
        System.out.println("mecanica2: jogue por 5 rodadas - cada acerto contabiliza 10 pontos, cada erro contabiliza -5 pontos");
        System.out.println("mecanica1: digite 1");
        System.out.println("mecanica2: digite 2");
        System.out.println("escolher aleatóriamente: digite 3");
        System.out.println("esperando sua escolha: ");
    }
    public static void limparconsole(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        int reiniciar=0;
       do {
           limparconsole();
           System.out.println("Vamos começar!!!");
           Scanner scanner = new Scanner(System.in);
           FabricaMecanicaDoJogo fm1 = new FabricaMecanicaDoJogo();
           FabricaEmbaralhadores fe1 = new FabricaEmbaralhadores();
           BancoDePalavras banco = new BancoDePalavras();

           menu();
           int escolha = scanner.nextInt();
           scanner.nextLine();

           MecanicaDoJogo m1 = fm1.getMecanicaDoJogo(escolha);
           System.out.println("pontuação Inicial: " + m1.getPontos());
           while (!m1.terminou()) {
               Embaralhador e = fe1.getEmbaralhadorAleatorio();
               String palavra = banco.sortearpalavra();
               String palavraEmbaralahda = e.embaralhar(palavra);

               System.out.println("Palavra embaralhada: " + palavraEmbaralahda);
               System.out.println("digite: ");
               String palavraDoJogador = scanner.nextLine().toLowerCase();

               if (m1.acertou(palavra, palavraDoJogador)) {
                   System.out.println("Correto!");


               } else {
                   System.out.println("Errou!");
               }
               m1.contabilizarPontuacao(m1.acertou(palavra, palavraDoJogador));
               System.out.println("pontuação: " + m1.getPontos());
           }
           System.out.println("O jogo terminou!");
           System.out.println("pontuação final: " + m1.getPontos());
           System.out.println("Digite 1 para recomeçar ou 0 para sair: ");
           try {
               reiniciar = scanner.nextInt();
           } catch (Exception e) {
               throw new RuntimeException(e);
           }

       } while(reiniciar==1);

    }

}

