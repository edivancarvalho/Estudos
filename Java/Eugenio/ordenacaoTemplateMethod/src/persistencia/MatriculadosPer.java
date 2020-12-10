package persistencia;

import model.Matriculados;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class MatriculadosPer {

    private String nomeDoArquivo;

    public MatriculadosPer(String nome) {
        nomeDoArquivo = nome;
    }

    //Metodo abstrato que ira compor o algoritmo de ordenacao da listagem
    public abstract boolean ePrimeiro(Matriculados aluno1, Matriculados aluno2);

    public ArrayList<Matriculados> listagemDeMatriculados() throws Exception {
        try {
            ArrayList<Matriculados> array = new ArrayList<Matriculados>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while ((linha = br.readLine()) != null) {
                Matriculados aux = new Matriculados(linha);
                array.add(aux);
                pos++;
            }
            br.close();
            //algoritmo de Ordenação
            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++) {

                    if (!ePrimeiro(array.get(i), array.get(j))) {
                        Matriculados temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                    }
                }
            }
            return array;
        } catch (Exception erro) {
            throw erro;
        }
    }
}
