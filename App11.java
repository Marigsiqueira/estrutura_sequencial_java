//Faça um programa na Linguagem Java que receba um número e mostre o resto da divisão por 6.


import java.util.Scanner;

public class App11 {
    public static void main (String args[]){
        int n, resultado;
        Scanner sc= new Scanner(System.in);
        System.out.printf("Digite um valor: ");
        n= sc.nextInt();
        resultado= n % 6;
        System.out.printf("O resto do número digitado dividido por 6 é: " + resultado);

    }
    
}
