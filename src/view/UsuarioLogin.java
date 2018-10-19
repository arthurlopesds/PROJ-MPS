package view;

import java.util.Scanner;

public class UsuarioLogin {
    
    public static int contLogin;
    public static void menuLogin(){
        System.out.println("-------------------- MENU LOGIN--------------------\n");
        System.out.println("Digite 1 para realizar o login com sua conta do aplicativo \n");
        System.out.println("Digite 2 para realizar o login com sua conta do SIGAA\n");   
    }

    public static void LoginConta(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome:\n");
        String nome = scan.nextLine();
        System.out.println("Digite sua senha:\n");
        String senha = scan.nextLine();
        contLogin++;
    }
    
    public static void LoginSIGAA(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Conectando com o SIGAA...\n");
        System.out.println("Digite seu login:\n");
        String nome = scan.nextLine();
        System.out.println("Digite sua senha:\n");
        String senha = scan.nextLine();
        contLogin++;
        
    }





}
