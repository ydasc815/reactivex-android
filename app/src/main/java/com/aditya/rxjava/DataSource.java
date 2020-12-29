package com.aditya.rxjava;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<Task> createTasksList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("This is description #1", true, 3));
        tasks.add(new Task("This is description #2", false, 2));
        tasks.add(new Task("This is description #3", true, 1));
        tasks.add(new Task("This is description #4", false, 0));
        tasks.add(new Task("This is description #5", true, 5));
        return tasks;
    }
}
