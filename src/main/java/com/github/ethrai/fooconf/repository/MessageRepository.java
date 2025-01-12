package com.github.ethrai.fooconf.repository;

import com.github.ethrai.fooconf.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepository extends JpaRepository<Message, Long>, PagingAndSortingRepository<Message, Long> {
}