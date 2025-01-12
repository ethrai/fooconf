package com.github.ethrai.fooconf.repository;

import com.github.ethrai.fooconf.model.Recording;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RecordingRepository extends JpaRepository<Recording, Long>, PagingAndSortingRepository<Recording, Long> {
}
