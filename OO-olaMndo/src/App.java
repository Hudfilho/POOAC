public class App {
    public static void main(String[] args) throws Exception {
        
        
        System.out.println("Hello, World!");
        
        //<tipoVar> <nomeVar1>, <nomeVar2> ....
        int x, y, z;
        //<tipoVar> <nomeVar> = <valor>
        String nome = "Hudson";
        
        //interos
        byte a = 123;     //8bits -128 a 127
        short b = 14451;    //16bits -32.768 a 32.767
        int c = 131445;      //32bits -> padrao
        long d = 10101010l;     //64bits é necessario adicionar l ao final do número
        
        //decimais
        float e = 4.58f; // 32bits
        double f = -105.48; //64bits -> padrao
        
        //booleano
        boolean g = true; //1bit
        boolean h = false;    
        
        //texto
        char letra = 'a'; //2bytes  uso de aspas simples
        String titulo = "The Soviet 1931-1933 Famines"; //não é um tipo de dado primitivo
        
        //type casting
        f = (double) b;
        c = (int) e;
        
        //Operadores 
        // Aritmeticos
        x = 10;
        y = 5;
        z = 9;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        
        
        //Atribuicao
        x += 2; //x = x+5
        y -= 5; //y = y-5
        
        x++; //x = x+1
        y--; //y = y-1
        
        System.out.println("-----------------");
        System.out.println(x);
        System.out.println(x++); //utiliza a varável e depois incrementa
        System.out.println(x);
        System.out.println(++x); //incrementa a variavel e depois utiliza
        System.out.println(x);
        System.out.println("-----------------");
        
        //Comparacao
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x < y);
        
        
        //Lógicos
        System.out.println("-----------------");
        System.out.println(!false);        //not
        System.out.println(true && false); //and
        System.out.println(true || true);  //or
        System.out.println("-----------------");
        
        
        //estrutura de decisao
        //if-else
        int idade = 18;
        if (idade > 18){
            System.out.println("Voce é maior de idade");
        }
        else if (idade<0){
            System.out.println("Idade invalida");
        }
        else{
            System.out.println("Voce é menor de idade");
        }
        
        //NAO É BOA PRÁTICA
        if (idade > 18)
            System.out.println("Voce é maior de idade");
        else
            System.out.println("Idade invalida");
            
        //switch
        char opcao = 'a';
        switch(opcao){
            case 'a':
                System.out.println("Opcao a");
                break;
                
            case 'b':
                System.out.println("Opcao b");
                break;
            
            case 'c':
                System.out.println("Opcao c");
                break;
                
            case 'd':
                System.out.println("Opcao d");
                break;
            
            default:
            System.out.println("Opcao invalida");
        }
        
        //estrutura de repeticao
        //for
        System.out.println("-----------------");
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
        
        System.out.println("-----------------");
        
        int i;
        for (i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println(i);
        
        for (i=0; i<10;i++){
            i++;
            if(i==3){
                continue; // Interrompe a iteração
            }
            if(i==5){
                break; //Interrompe o for
            }
        }
        
        //while
        System.out.println("-----------------");
        
        while (i > 0) {
            System.out.println(i--);
        }
        
        
        
        
        System.out.println("-----------------");
        System.out.println("""
                Hallo meinen Freunden,
                wie gehts?
                """);
    }
}
