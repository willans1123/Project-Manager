package model;

/**
 *
 * @author alexandre
 */
public class GrupoDeUsuario {
    private Long id;
    private String nomeDoGrupo;

public GrupoDeUsuario(Long id, String nomeDoGrupo) {
        this.id = id;
        this.nomeDoGrupo = nomeDoGrupo;
    }

public Long getId() {
        return id;
    }

public void setId(Long id) {
        this.id = id;
    }

public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

public void setNomeDoGrupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
    }
}
