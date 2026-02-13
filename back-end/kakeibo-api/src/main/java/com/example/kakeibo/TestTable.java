package com.example.kakeibo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "test_table") // DBeaverで作ったテーブル名と合わせる
@Data
public class TestTable {
    @Id
    private Integer id;
    private String name;
    private String memo;
}