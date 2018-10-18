package view;

public class UsuarioForm {
    
    public static void menu(){
        System.out.println("-------------------- MENU --------------------\n");
        System.out.println("Digite 1 para adicionar novo usuário.\n");
        System.out.println("Digite 2 para remover um usuário.\n");
        System.out.println("Digite 3 para visualizar os usuários.\n");
        System.out.println("Digite outro valor para sair e salvar.\n");
    }
    
    public static void addNomeU(){
        System.out.println("Digite um nome: ");
    }
    
    public static void addSenhaU(){
        System.out.println("Digite uma senha: ");
    }
    
    public static void removerUsuario(){
        System.out.println("Digite o nome do usuário que deseja excluir: ");
    }
    
    public static void salvar(){
        System.out.println("Aguarde enquanto salvamos seus dados.");
    }
    
    public static void sair(){
        System.out.println("Seus dados foram salvos com sucesso. Saindo do sistema");
    }
}
