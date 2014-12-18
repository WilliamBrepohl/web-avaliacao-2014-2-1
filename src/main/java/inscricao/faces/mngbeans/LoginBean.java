package inscricao.faces.mngbeans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String usuario;
    private String senha;
    private boolean admin;
    
    public LoginBean() {
    }

    public String botaoEntrar(){
        if(usuario.equals(senha)){
            if(admin){
                return "admin.xhtml";
            }else{
                return "cadastro.xhtml";
            }
            
        }else{
            FacesContext facesContext = FacesContext.getCurrentInstance();
            FacesMessage facesMessage = new FacesMessage("Login e/ou senha incorretos");
            facesContext.addMessage(null, facesMessage);
        }
        return "";
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}
