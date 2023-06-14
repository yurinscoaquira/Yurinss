
package pe.edu.upeu.MYCJ.dao;

import java.util.List;
import pe.edu.upeu.MYCJ.modelo.ResultadoTO;



public interface ResultadoDaoI {

    public int create(ResultadoTO d);

    public int update(ResultadoTO d);

    public int delete(String id) throws Exception;

    public List<ResultadoTO> listCmb(String filter);

    public List<ResultadoTO> listarResultado();

    public ResultadoTO buscarResultado(int id);

    public void reportarResultado();
}
