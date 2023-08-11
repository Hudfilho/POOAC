public class App {
    public static void main(String[] args) throws Exception {
        //calculaMedia(10,9,8);
        //exibe150A200();
        //ePrimo(1);
        //diaDaSemana(8);
        eBissexto(2000);
        eBissexto(2012);
        eBissexto(1900);
    }
    
    //1
    /*Faça um método que receba como parâmetros as três notas da disciplina
    (AP1, AP2 e AC) e mostre a média. A média é calculada de acordo com a 
    fórmula M = (AP1 + AP2) * 0.4 + AC * 0.2.
    */
    public static void calculaMedia(double Ap1, double Ap2, double Ac){
        double media = (Ap1+Ap2)*0.4 +Ac*0.2;
        System.out.println(media);
    }
    
    //2
    //Implemente um método que exiba todos os números de 150 a 200.
    public static void exibe150A200(){
        int i = 150;
        while(i <= 200){
            System.out.println(i++);
        }
    }
    
    //3
    /*Elabore um método ePrimo(int num) que retorna se um número num é primo 
    ou não. Caso o número não seja primo, liste todos os números pelos quais 
    ele é divisível.*/
    public static void ePrimo(int num){
        int i = 2;
        boolean primo = true;
        while (i <= num/2){
            if(num%i == 0){
                System.out.println("Não é primo, divisivel por "+i);
                primo = false;
            }
            else if (num == 1){
                System.out.println("1 não é primo!");
                primo = false;
            }
            i++;
        }
        if (primo == true){
            System.out.println("É primo");
        }
    }
    
    //4
    /*Implemente um método que receba como parâmetro um número inteiro e exiba 
    o dia correspondente da semana (1-Domingo, 2- Segunda, etc.), se digitar 
    outro valor deve aparecer o texto “valor inválido”. */
    public static void diaDaSemana(int num){
        switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            
            
            case 2:
                System.out.println("Segunda");
                break;            
            
            case 3:
                System.out.println("Terca");
                break;
    
            case 4:
                System.out.println("Quarta");
                break;
            
            case 5:
                System.out.println("Quinta");
                break;
    
            case 6:
                System.out.println("Sexta");
                break;
            
            case 7:
                System.out.println("Sabado");
                break;
            
            default:
                System.out.println("Número invalido");
        }
            
    }
    
    //5
    /*Elabore um método eBissexto(int ano) que receba como parâmetro um número 
    correspondente a um determinado ano e em seguida informe se este ano é ou 
    não bissexto. Um ano é bissexto se ele é múltiplo de quatro. No entanto 
    anos múltiplos de 100 que não são múltiplos de 400 não são bissextos. 
    Então 1995 não é bissexto, 2012 é bissexto, 1900 não é bissexto e 2000 é bissexto. */
    public static void eBissexto(int ano){
        if ((ano %100 == 0 && ano%400 !=0) || ano%4!=0){
            System.out.println("Não é bissexto");
        }
        else{
            System.out.println("É bissexto");
        }
    }
    
}
