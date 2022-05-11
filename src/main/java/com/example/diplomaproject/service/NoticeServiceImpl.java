package com.example.diplomaproject.service;

import com.example.diplomaproject.documents.Notice;
import com.example.diplomaproject.repository.NoticeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class NoticeServiceImpl implements NoticeService {

    private NoticeRepository noticeRepository;

    @Override
    public Flux<Notice> getAll() {
        return noticeRepository.findAll();
    }

    @Override
    public Mono<Notice> getById(String id) {
        return noticeRepository.findById(id);
    }

    @Override
    public Mono<Notice> save(Notice notice) {
        return noticeRepository.save(notice);
    }

    @Override
    public Mono<Void> deleteById(String id) { return noticeRepository.deleteById(id); }

}
