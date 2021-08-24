package sistemaalunos;

/**
 *
 * @author lpmel
 */
public class Main {

    public static void main(String[] args) {
        //Testando o programa
        System.out.println("-----------------------------------------------------");
        AlunoRegular ar = new AlunoRegular("Nome Aluno Regular","RA Qualquer");
        ar.registrarFaltas(15);
        ar.registrarNotas(8, 9);
        ar.historico();
        System.out.println("-----------------------------------------------------");
        AlunoAssistente as = new AlunoAssistente("Nome Aluno Assistente", "RG Qualquer");
        as.receberResumo();
        as.registrarFaltas(15);
        as.historico();
    }
    
}
