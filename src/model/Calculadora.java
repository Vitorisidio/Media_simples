package model;

import java.util.Scanner;

public class Calculadora {

    String nomeAluno;
    double nota1, nota2, nota3, nota4;
    double resultadoDasNotas;

    public void obterDados() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("** CALCULADORA DE MÉDIA SIMPLES**");
        System.out.println("----------------------------------");

        System.out.print("Qual o nome do aluno? ");
        nomeAluno = leitor.nextLine();

        System.out.println("Qual é o a nota 1 do(a) aluno(a) " + nomeAluno + "?");
        nota1 = leitor.nextDouble();

        System.out.println("Qual é o a nota 2 do(a) aluno(a) " + nomeAluno + "?");
        nota2 = leitor.nextDouble();

        System.out.println("Qual é o a nota 3 do(a) aluno(a) " + nomeAluno + "?");
        nota3 = leitor.nextDouble();

        System.out.println("Qual é o a nota 4 do(a) aluno(a) " + nomeAluno + "?");
        nota4 = leitor.nextDouble();

        calcularMedia();
    }

    public void calcularMedia(){

        resultadoDasNotas=(nota1+nota2+nota3+nota4) / 4;

        resultado();

    }

        public void resultado(){

            if (resultadoDasNotas >= 5) {

                System.out.println( nomeAluno + " FOI APROVADO COM A NOTA " +  resultadoDasNotas);

            } else {

                System.out.println(nomeAluno + " FOI REPROVADO COM A NOTA" +  resultadoDasNotas);

            }



        }


    }








