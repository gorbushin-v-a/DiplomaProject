package com.example.diplomaproject.repository;

import com.example.diplomaproject.documents.Testcoll;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestcollRepository extends ReactiveMongoRepository<Testcoll, String> {


}
