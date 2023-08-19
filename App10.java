/*Faça um programa na Linguagem Java para efetuar a leitura de um número inteiro e apresentar o resultado 
do quadrado desse número.*/


import java.util.Scanner;

public class App10 {
    public static void main (String args[]){
    int n, resultado;
    Scanner sc= new Scanner(System.in);
        System.out.printf("Digite um valor: ");
        n= sc.nextInt();
        resultado= n * n;
        System.out.printf("O resultado do quadrado do valor digitado é: " + resultado);  
}
}
