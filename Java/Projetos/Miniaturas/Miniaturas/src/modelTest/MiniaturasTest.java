package modelTest;

import model.Fabricantes;
import model.Fotos;
import model.Miniaturas;
import model.Temas;
import model.Tipo_miniaturas;

/**
 *
 * @author edivan
 */
public class MiniaturasTest {

    public static void main(String[] args) {
        Miniaturas miniaturas = new Miniaturas(1, "2000", "2020", "Em otimos estado", "Unica", "nove", 90.00);
        
        Fabricantes fabricantes = new Fabricantes(1, "ford");
        Fabricantes fabricantes1 = new Fabricantes(2, "Gol");

        Tipo_miniaturas tipo_miniaturas = new Tipo_miniaturas(1, "Medio");
        Tipo_miniaturas tipo_miniaturas2 = new Tipo_miniaturas(2, "Medio porte");
        
        Temas temas = new Temas(1, "Ouro");
        
        Fotos fotos = new Fotos(1, "./src", "G4 fox");
        Fotos fotos1 = new Fotos(2, "./src", "G5 fox");
        
        miniaturas.print();
        tipo_miniaturas.print();
        
        fabricantes.print();
        temas.print();
        fotos.print();
        

    }

}
