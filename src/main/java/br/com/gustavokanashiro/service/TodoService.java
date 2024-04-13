package br.com.gustavokanashiro.service;

import br.com.gustavokanashiro.entity.Todo;
import br.com.gustavokanashiro.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create (Todo todo){
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> update (Todo todo){
        todoRepository.save(todo);
        return list();

    }
    public List<Todo>delete (Long id){
        todoRepository.deleteById(id);
        return list();
    }
    public List<Todo> list (){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sort);
    }
}
