package com.github.ethrai.fooconf.repository;

import com.github.ethrai.fooconf.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PollRepository extends JpaRepository<Poll, Long>, PagingAndSortingRepository<Poll, Long> {
}
