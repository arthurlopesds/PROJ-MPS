package view;

import java.util.Scanner;

public class LoginContaApp  implements Login{

    @Override
    public int FazerLogin(int op) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome:\n");
        String nome = scan.nextLine();
        System.out.println("Digite sua senha:\n");
        String senha = scan.nextLine();
        
        return 1;
    }
}
