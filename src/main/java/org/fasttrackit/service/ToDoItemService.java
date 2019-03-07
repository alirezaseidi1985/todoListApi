package org.fasttrackit.service;

import org.fasttrackit.damain.ToDoItem;
import org.fasttrackit.persistence.ToDoItemRepository;
import org.fasttrackit.transfer.SaveToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {

    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
    public void createToDoItem(SaveToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating item: " + request);
        toDoItemRepository.createToDoItem(request);
    }

    public List<ToDoItem> getToDoItems() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Getting To do items.");
        return toDoItemRepository.getToDoItems();
    }
}
