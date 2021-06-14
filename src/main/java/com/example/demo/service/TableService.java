package com.example.demo.service;

import com.example.demo.entity.Table;
import com.example.demo.repository.TableRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableService {
    @Autowired
    private TableRespository tableRepository;

    public List<Table> saveTable(List<Table> tables ){ return tableRepository.saveAll(tables);}

    public Table saveTable(Table table) {
        return tableRepository.save(table);
    }

    public Optional<Table> findTableById(Long tableId) {
        return tableRepository.findById(tableId);
    }

    public void deleteTableById(Long tableId) {
        tableRepository.deleteById(tableId);
    }

    public List<Table> GetAllTables() {
        return tableRepository.findAll();
    }

}
