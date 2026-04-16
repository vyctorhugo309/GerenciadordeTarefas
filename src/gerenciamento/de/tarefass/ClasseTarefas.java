
package gerenciamento.de.tarefass;


public class ClasseTarefas {
    
    private String titulo;
    private String descricao;
    private boolean concluida;     

    public ClasseTarefas(String titulo, String descricao, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    } 
    public void marcaComConcluida(){
        this.concluida = true;
        if(concluida){
            System.out.println("concluido ");
        }
    }

    
}