package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.Conference;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Conference}
 */
public record ConferenceDto(Long id, String title, String description, LocalDateTime startTime,
                            LocalDateTime endTime) implements Serializable {
}