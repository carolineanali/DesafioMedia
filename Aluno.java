public class Aluno {
    private String nome;
    private String nomeCurso;
    private int periodo;
    private float nota1;
    private float nota2;
    private float media;
    private float necessarioFinal;
    private float necessarioRecuperacao;

    Aluno(){
    }

    Aluno(String nome, String nomeCurso, int periodo, float nota1, float nota2, float media, float necessarioFinal, float necessarioRecuperacao){
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.necessarioFinal = necessarioFinal;
        this.necessarioRecuperacao = necessarioRecuperacao;
    }
    Aluno(String nome, String nomeCurso, int periodo, float nota1, float nota2){
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }


    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getNecessarioFinal() {
        return necessarioFinal;
    }

    public void setNecessarioFinal(float necessarioFinal) {
        this.necessarioFinal = necessarioFinal;
    }

    public float getNecessarioRecuperacao() {
        return necessarioRecuperacao;
    }

    public void setNecessarioRecuperacao(float necessarioRecuperacao) {
        this.necessarioRecuperacao = necessarioRecuperacao;
    }
}
