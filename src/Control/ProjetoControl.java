package Control;

/**
 *
 * @author alexandre
 */
public class ProjetoControl {
    private static ProjetoControl controladorProjeto;

    public static ProjetoControl getInstance(){
    if(controladorProjeto == null){
    controladorProjeto = new ProjetoControl();
    return controladorProjeto;
    }
    return controladorProjeto;
    }
    public void cadastrarProjeto(){
    }
    public void deletarProjeto(){
    }
    public void editarProjeto(){
    }
    public void listarProjeto(){
    }
}

