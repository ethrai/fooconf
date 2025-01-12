package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.Poll;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link Poll}
 */
public record PollDto(Long id, String title, Set<PollOptionDto> options) implements Serializable {
}