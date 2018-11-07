package infra;

public abstract class Relatorio {
    
    final void Relat(){
       qtdeAcesso();
       GerarArquivo();
    }
    
    public abstract void GerarArquivo();
    
    final void qtdeAcesso(){ 
        System.out.println("15 acessos pelo aplicativo nos últimos 3 dias\n");
        System.out.println("45 acessos pelo SIGAA nos ultimos 2 dias");
    }

}
