package com.github.ethrai.fooconf.repository;

import com.github.ethrai.fooconf.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long>, PagingAndSortingRepository<Conference, Long> {
}
