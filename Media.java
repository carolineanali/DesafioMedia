import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Dados controladorDadosAlunos = new Dados();
        Aluno aluno = controladorDadosAlunos.cadastrarAluno();
        float media = controladorDadosAlunos.gerarMediaAluno(aluno.getNota1(), aluno.getNota2(), aluno.getMedia());
        float necessario1 = controladorDadosAlunos.necessarioFinal( aluno.getNecessarioFinal(), aluno.getNota1(), aluno.getNota2());
        float necessario2 = controladorDadosAlunos.necessarioRecuperacao( aluno.getNecessarioRecuperacao(), aluno.getNota1(), aluno.getNota2());


        aluno.setMedia(media);
        aluno.setNecessarioFinal(necessario1);
        aluno.setNecessarioRecuperacao(necessario2);

        if(media > 0 && media <= 4.9){
            System.out.println("Aluno em recuperação, "+ "você precisa de " + aluno.getNecessarioRecuperacao());
        }if(media >= 5 && media <= 6.9){
            System.out.println("Aluno na prova final, "+ "você precisa de " + aluno.getNecessarioFinal());
        }if(media >= 7 && media <= 10){
            System.out.println("Aluno aprovado por média");
        }
    }


    
 }

