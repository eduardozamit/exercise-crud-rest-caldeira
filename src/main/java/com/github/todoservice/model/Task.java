package com.github.todoservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor


public class Task {
    private int id;
    private String name;
    private String description;
    private boolean state;
}
