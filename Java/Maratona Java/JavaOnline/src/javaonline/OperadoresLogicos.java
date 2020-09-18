package javaonline;

/**
 *
 * @author edivan
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        
        // 2 tipos de operdaores logicos;
        int idade = 18;
        float salario = 1000f;
        
        System.out.println(idade >= 18 && salario >= 3000);
        
        System.out.println(idade >= 18 || salario >= 1000);
    }
    
}
