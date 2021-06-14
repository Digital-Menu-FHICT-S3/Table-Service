package com.example.tableservice.repository;

import com.example.tableservice.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRespository extends JpaRepository<Table, Long> {
}
