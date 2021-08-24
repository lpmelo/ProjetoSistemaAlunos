package sistemaalunos;

/**
 *
 * @author lpmel
 */
public abstract class Aluno {

    //Variáveis 
    private String nome;
    private int qtdFaltas;

    //Construtor
    public Aluno(String vNome) {
        if (!vNome.isEmpty()) {
            this.nome = vNome;
        }
        this.qtdFaltas = 0;
    }
    //Getter's e Setter's

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    //Métodos
    public void registrarFaltas(int qtd) {
        this.qtdFaltas += qtd;
    }

    public double frequencia() {
        double faltas = 0;
        faltas = this.qtdFaltas;
        return ((((faltas/60) * 100)-100)*-1);
    }

    abstract public boolean aprovado();

    public void historico() {
        System.out.println("Nome: " + this.nome 
                + "\nFaltas: " + this.qtdFaltas
                + "\nFrequência: " + frequencia()+"%");
    }

}
