package infra;

public class GeraArquivos {
    public void GerarArquivos(Relatorio relatorio){
        if("RelatorioPDF".equals(relatorio.getClass().getName())){
            ((RelatorioPDF)relatorio).GerarArquivo();
        }
        if("RelatorioXML".equals(relatorio.getClass().getName())){
            ((RelatorioXML)relatorio).GerarArquivo();
        } 
    }
}
