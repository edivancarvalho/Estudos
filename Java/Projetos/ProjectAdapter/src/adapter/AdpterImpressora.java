package adapter;

/**
 *
 * @author edivan
 */
public class AdpterImpressora  implements IImprimirNotaFiscal{
    ImpressoraDoRoro objeto = new ImpressoraDoRoro();

    @Override
    public String imprimirNotaFiscal(NotaFiscal objNota) {
        String str = "NOTA FISCAL \n";
        str += objNota.getDados() + "\n";
        return objeto.escrevrNaImpressoraNotaFiscal(str);
    }
    
    
}
