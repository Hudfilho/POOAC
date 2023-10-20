import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        //vetores();
        //arrayList();
        //linkedList();
        //pilha();
        //conjunto();
        mapa();
    }

    public static void vetores(){
        int tamanho = 5;
        int[] arrayInteiros = new int[tamanho];
        System.out.println(arrayInteiros);

        String[] letras = {"a", "e", "i", "o", "u"};
        System.out.println(letras);
        System.out.println(letras.length);

        letras[2] = "f";
        System.out.println(letras[2]);

        arrayInteiros[3] = 2;

        //percorrendo todos os elementos do array
        for (int i=0; i<tamanho; i++){
            System.out.println(arrayInteiros[i]);
        }

        for (String letra : letras){
            System.out.println(letra);
        }
    }

    public static String[] aumentaVetor(String[] vetor){
        String[] novoVetor = new String[vetor.length + 1];
        
        for (int i = 0; i < vetor.length; i++){
            novoVetor[i] = vetor[i];
        }

        return novoVetor;
    }

    public static void arrayList(){
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(8);
        numeros.add(3);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get(1));

        numeros.remove(0);
        System.out.println(numeros);

        for(Integer numero : numeros){
            System.out.println(numero);
        }

        System.out.println(numeros.contains(8));

        numeros.add(0, 14);
        System.out.println(numeros);

        numeros.set(0, 999);
        System.out.println(numeros);

        numeros.clear();
        System.out.println(numeros.size());
    }

    public static void linkedList(){
        LinkedList<String> carros = new LinkedList<>();
        System.out.println(carros);

        carros.add("gol");
        carros.add(0, "corsa");

        System.out.println(carros);

        System.out.println(carros.indexOf("gol"));

        //pop e push sao  mais eficientes que add e remove
        //remove o primeiro item da lista
        carros.pop();
        System.out.println(carros);

        //adiciona no primeiro elemento da lista
        carros.push("palio");
        System.out.println(carros);

        carros.remove(1);
        System.out.println(carros);
    }

    public static void pilha(){
        Stack<Double> notas = new Stack<>();
        
        notas.push(4.5);
        notas.push(8.8);
        System.out.println(notas.peek());

        notas.push(0.7);
        System.out.println(notas.peek());

        notas.pop();
        System.out.println(notas.peek());
        System.out.println(notas);

        for (Double nota : notas){
            System.out.println(nota);
        }
    }

    public static void conjunto(){
        HashSet<String> frutas = new HashSet<>();

        frutas.add("maçã");
        frutas.add("laranja");
        frutas.add("melancia");
        System.out.println(frutas);

        frutas.add("maçã");
        System.out.println(frutas);
        
        for(String fruta : frutas){
            System.out.println(fruta);
        }

        frutas.remove("laranja");
        System.out.println(frutas);

    }

    public static void mapa(){
        HashMap<String, String> alunos = new HashMap<>();
        
        alunos.put("1234", "Joao");
        alunos.put("5678", "Aline");

        System.out.println(alunos);
        System.out.println(alunos.get("1234"));
        System.out.println(alunos.get("5678"));

        alunos.remove("1234");
        alunos.remove("1235"); //não vai fazer nada
        System.out.println(alunos);

        System.out.println(alunos.containsKey("1111"));
        System.out.println(alunos.containsValue("Maria"));
        System.out.println(alunos.containsKey("5678"));
        System.out.println(alunos.containsValue("Aline"));

        System.out.println(alunos.size());

        for (String matricula : alunos.keySet()){
            System.out.println(matricula);
            System.out.println(alunos.get(matricula));
        }

        for (String nome: alunos.values()){
            System.out.println(nome);
        }

    }

}
