package facade;

import Control.UsuarioControl;
import java.util.ArrayList;
import model.Usuario;
/**
 *
 * @author alexandre
 */

public class facade {
    public static boolean cadastrarUsuario(Usuario usuario){
        return UsuarioControl.cadastrarUsuario(usuario);
    }    
    public static boolean deletarUsuario(Usuario usuario){
        return UsuarioControl.deletarUsuario(usuario);
    }    
    public static boolean editarUsuario(Usuario usuario){
        return UsuarioControl.editarUsuario(usuario);
    }    
    public static ArrayList<Usuario> listarUsuarios(){
        return UsuarioControl.listarUsuario();
    }    
    public static boolean deletarUsuario(Usuario usuario){
        return UsuarioControl.deletarUsuario(usuario);
    }
}