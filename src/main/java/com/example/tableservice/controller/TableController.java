package com.example.tableservice.controller;

import com.example.tableservice.entity.Table;
import com.example.tableservice.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/table")
public class TableController {

    @Autowired
    private TableService tableService;

    @PostMapping("/create")
    public Table saveCategory(@RequestBody Table table){
        return tableService.saveTable(table);
    }

    @GetMapping("/{id}")
    public Optional<Table> findCategoryById(@PathVariable("id") Long categoryId){
        return tableService.findTableById(categoryId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTableById(@PathVariable("id") Long categoryId){
        tableService.deleteTableById(categoryId);
    }

    @GetMapping("/all")
    public List<Table> getAllTable(){
        return tableService.GetAllTables();
    }

    @PutMapping("/update")
    public Table updateTable(@RequestBody Table category) {
        return tableService.saveTable(category);
    }
}
