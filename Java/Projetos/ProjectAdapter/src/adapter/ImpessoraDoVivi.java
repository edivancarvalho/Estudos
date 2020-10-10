package adapter;

/**
 *
 * @author edivan
 */
public class ImpessoraDoVivi implements IImprimirNotaFiscal{

    @Override
    public String imprimirNotaFiscal(NotaFiscal objNota) {
        return "Impressora do VIVI \n Dados da Nota Fiscal: \n" + objNota.getDados();
    }
    
}
