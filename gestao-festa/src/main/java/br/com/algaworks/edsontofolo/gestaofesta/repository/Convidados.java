package br.com.algaworks.edsontofolo.gestaofesta.repository;

import br.com.algaworks.edsontofolo.gestaofesta.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Edson on 25/03/2018.
 */
public interface Convidados extends JpaRepository<Convidado, Long> {
}
