package view;

public class Contexto {
    
    private Login strategy;
    
    public Contexto(Login login){
        this.strategy = login;
    }
    
    public  int realizaLogin(int op){
    
     return strategy.FazerLogin(op);

    }
}
