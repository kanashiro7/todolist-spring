package br.com.gustavokanashiro.repository;

import br.com.gustavokanashiro.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
