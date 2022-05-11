package com.example.diplomaproject.repository;

import com.example.diplomaproject.documents.Notice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends ReactiveMongoRepository<Notice, String> {


}
