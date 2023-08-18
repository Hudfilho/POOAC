import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        double valorMemoria;
        double valorInput;
        String msg = "0";
        boolean loopOperacao;
        boolean loopDecisaoFinal;


        System.out.print("Informe o primeiro numero da operacao: ");
        valorMemoria = leitor.nextDouble();

        while(!msg.equals("sair")){

            System.out.print("Informe o segundo número da operacao: ");
            valorInput = leitor.nextDouble();

            do{
                loopOperacao = false;
                System.out.print("""
                        Informe a proxima operacao:
                        (+) SOMA            (-) SUBTRACAO
                        (x) MULTIPLICACAO   (/) DIVISAO
                        """);
                msg = leitor.next();
                
                switch(msg){
                    case("+"):
                        valorMemoria = somar(valorMemoria, valorInput);
                        break;
                    case("-"):
                        valorMemoria = subtrair(valorMemoria, valorInput);
                        break;
                    case("x"):
                        valorMemoria =multiplicar(valorMemoria, valorInput);
                        break;
                    case("/"):
                        valorMemoria = dividir(valorMemoria, valorInput);
                        break;
                    default:
                        System.out.println("Operacao invalida");
                        loopOperacao = true;
                }
            } while(loopOperacao);
                
            System.out.println("Resultado: " + valorMemoria);

            do{
                loopDecisaoFinal = false;
                System.out.print("""
                        Digite:
                        (1) para limpar a memoria;
                        (2) para realizar uma nova operacao;
                        (sair) para finalizar o programa.
                        """);
                msg = leitor.next();
                switch(msg){
                    case "1":
                    System.out.print("Informe o primeiro numero da operacao: ");
                    valorMemoria = leitor.nextDouble();
                    case "2":
                    break;
                    case "sair":
                    break;
                    default:
                    loopDecisaoFinal = true;
                }
            } while(loopDecisaoFinal);
        }
        leitor.close();
    }

    public static double somar(double num1, double num2){
        return num1+num2;
    }

    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        return num1/num2;
    }
}

