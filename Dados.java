import java.util.Scanner;

public class Dados {

    public Aluno cadastrarAluno(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do Curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.println("Digite o periodo que você cursa: ");
        int numeroPeriodo = scanner.nextInt();
        System.out.println("Digite o valor da primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite o valor da segunda nota: ");
        float nota2 = scanner.nextFloat();


        return new Aluno(nome,nomeCurso,numeroPeriodo,nota1,nota2);
    }

    public float gerarMediaAluno(float nota1, float nota2, float media){
        media = (nota1+nota2)/2;
        return media;     
    }

    public float necessarioFinal(float necessarioFinal, float nota1, float nota2){
        necessarioFinal = 10 - (nota1+nota2)/2;
        return necessarioFinal;
    }

    public float necessarioRecuperacao(float necessarioRecuperacao, float nota1, float nota2){
        necessarioRecuperacao = ((10 - (nota1+nota2)/2)) + 2;
        return necessarioRecuperacao;

    }

}


