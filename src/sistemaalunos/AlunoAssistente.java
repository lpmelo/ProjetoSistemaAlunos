package sistemaalunos;

/**
 *
 * @author lpmel
 */
public class AlunoAssistente extends Aluno {

    //Variáveis
    private String RG;
    private boolean resumo;

    //Construtor
    public AlunoAssistente(String vNome, String vRG) {
        super(vNome);
        if (!vRG.isEmpty()) {
            this.RG = vRG;
        }
        this.resumo = false;

    }

    //Getter's e Setter's
    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        if (!RG.isEmpty()) {
            this.RG = RG;
        }
    }

    //Métodos
    public void receberResumo() {
        this.resumo = true;
    }
    
    @Override
    public void historico(){
        super.historico();
        System.out.println("RG: " + RG);
        
        if(resumo){
            System.out.println("Resumo: Entregue");
        }else{
            System.out.println("Resumo: Não entregue");
        }
        
        if(aprovado()){
            System.out.println("Aprovado: Sim");
        }else{
            System.out.println("Aprovado: Não");
        }
    }
    
    @Override
    public boolean aprovado() {
       if(resumo && frequencia() >= 75){
            return true;
        }else{
            return false;
        }
    }

}


