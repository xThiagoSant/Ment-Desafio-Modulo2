import java.util.Random;
import java.util.Scanner;

class SegundoModulo {
    public static void main(String[] args) {
        int input = 0;
        Scanner selectedInput = new Scanner(System.in);
        while( input < 3){
            System.out.println("Olá usuário");
            System.out.println("--------------------------------");
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - Qual meu número da sorte?");
            System.out.println("2 - Qual meu IMC?");
            System.out.println("3 - Sair do sistema");
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("Selecione uma opção no menu.");
            
            input = selectedInput.nextInt();
    
            switch (input) {
                case 1:{
                    Random generate = new Random();
                    System.out.print("Resultado: ");
                    System.out.println(generate.nextInt(999999));
                    System.out.println("");
                    break;
                } 
                case 2:{
                    System.out.println("Informe seu peso.");
                    float peso = selectedInput.nextFloat();
                    System.out.println("Informe sua altura.");
                    float altura = selectedInput.nextFloat(); 
                    IMC imc = new IMC(altura, peso);
                    System.out.print("Resultado: ");
                    System.out.println(imc.getIMC());
                    System.out.println("");
                    break;
                }
                case 3:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
            }
        }
        selectedInput.close();
    }
}