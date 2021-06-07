package com.example.demo.repository;

import com.example.demo.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRespository extends JpaRepository<Table, Long> {
}
