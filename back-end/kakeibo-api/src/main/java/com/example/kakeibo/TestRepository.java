package com.example.kakeibo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestTable, Integer> {
    // これだけで、データの全取得や保存ができるようになります！
}