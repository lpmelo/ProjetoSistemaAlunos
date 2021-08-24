package sistemaalunos;

/**
 *
 * @author lpmel
 */
public class AlunoRegular extends Aluno {

    //Variáveis
    private double nota1, nota2;
    private String ra;

    //Construtor
    public AlunoRegular(String vNome, String vRA) {
        super(vNome);
        this.nota1 = 0;
        this.nota2 = 0;
        if (!vRA.isEmpty()) {
            this.ra = vRA;
        }
    }

    //Getter's e Setter's
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        if (!ra.isEmpty()) {
            this.ra = ra;
        }
    }

    //Métodos
    public void registrarNotas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public void abonarFaltas(int qtd) {
        if (qtd < 5) {
            if (this.getQtdFaltas() < qtd) {
                this.setQtdFaltas(0);
            } else {
                this.setQtdFaltas(this.getQtdFaltas() - qtd);
            }
        }
    }

    @Override
    public boolean aprovado() {
        if (media() >= 6 && frequencia() >= 75) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void historico() {
        super.historico();
        System.out.println("RA: "+ ra
                +"\nNota1: " + nota1
                + "\nNota2: " + nota2
                + "\nMédia: " + media());
        if (aprovado()) {
            System.out.println("Aprovado: Sim");
        } else {
            System.out.println("Aprovado: Não");
        }
    }

}
