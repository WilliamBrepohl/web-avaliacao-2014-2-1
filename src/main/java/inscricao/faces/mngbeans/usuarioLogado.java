package inscricao.faces.mngbeans;

import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named(value = "usuarioLogado")
@ApplicationScoped
public class usuarioLogado {

    private String nome;
    private Date data;
    
    public usuarioLogado() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
