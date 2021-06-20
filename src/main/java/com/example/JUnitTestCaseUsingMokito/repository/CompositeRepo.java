package com.example.JUnitTestCaseUsingMokito.repository;

import com.example.JUnitTestCaseUsingMokito.entity.compositeKey.CompositeKey;
import com.example.JUnitTestCaseUsingMokito.entity.compositeKey.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompositeRepo extends JpaRepository<MainEntity, CompositeKey> {
}
