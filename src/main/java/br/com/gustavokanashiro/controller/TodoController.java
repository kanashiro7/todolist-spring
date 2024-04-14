package br.com.gustavokanashiro.controller;

import br.com.gustavokanashiro.entity.Todo;
import br.com.gustavokanashiro.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo> create (@RequestBody Todo todo){
        return todoService.create(todo);
    }
    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }
    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }
}
