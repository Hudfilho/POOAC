import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Arquivo {

    static String caminho = "";

    public Arquivo(String caminho){
        this.caminho = caminho;
    }

    public HashMap<String, Aluno> lerAlunos() {
        HashMap<String, Aluno> alunosMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("/");
                Aluno aluno = new Aluno(data[1].trim(), data[2].trim(), data[0].trim());
                alunosMap.put(data[0].trim(), aluno);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        return alunosMap;
    }


    public void escreverAlunos(HashMap<String, Aluno> alunos) {
        try (PrintWriter writer = new PrintWriter(caminho)) {
            for (Aluno aluno : alunos.values()){
                writer.print(aluno.getMatricula()+"/"+aluno.getNome()+"/"+aluno.getCurso()+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}