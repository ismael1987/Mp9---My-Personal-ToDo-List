package com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.controller;

import com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.persistence.ToDo;
import com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.persistence.ToDoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class EndPoint {

    private ToDoRepository toDoRepository;

    public EndPoint(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    @GetMapping
    List<ToDo> getalltodos(){
       return toDoRepository.findAll();
    }

    @PostMapping
    void setToDo(@RequestBody ToDo toDo){
        toDoRepository.save(toDo);
    }
}
