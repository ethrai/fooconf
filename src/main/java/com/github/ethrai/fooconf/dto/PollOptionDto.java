package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.PollOption;

import java.io.Serializable;

/**
 * DTO for {@link PollOption}
 */
public record PollOptionDto(Long id, String optionText, int voteCount) implements Serializable {
}