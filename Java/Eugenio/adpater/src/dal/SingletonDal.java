package dal;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author edivan
 */
public class SingletonDal {

    private static SingletonDal instance;
    
    private SingletonDal() {
    }
    
    public static SingletonDal getInstance (){
        if(instance == null){
            instance = new SingletonDal();
        }
        return instance;
    }
    
    public void logSalvar(String log) {

        try {            
            FileWriter fw = new FileWriter("log.log", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(log);
            
            pw.flush();
            pw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("erro ao escrever o arquivo log");
        }
    }

}
