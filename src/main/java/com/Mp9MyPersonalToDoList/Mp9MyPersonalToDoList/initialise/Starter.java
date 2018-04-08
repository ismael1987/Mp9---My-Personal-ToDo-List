package com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.initialise;

import com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.persistence.ToDo;
import com.Mp9MyPersonalToDoList.Mp9MyPersonalToDoList.persistence.ToDoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration

public class Starter {


    @Bean
    ApplicationRunner applicationRunner(ToDoRepository toDoRepository){
        return args -> {
            toDoRepository.deleteAll();
            List<ToDo> toDos = crattodo() ;
            toDoRepository.saveAll(toDos);

            toDoRepository.findAll().forEach(System.out::println);

        };
    }

    private List<ToDo> crattodo() {
        return Stream.of(new ToDo("play football"),
                new ToDo("read books"),
                new ToDo("solving java problem"),
                new ToDo("make food")
        ).collect(Collectors.toList());
    }
}
