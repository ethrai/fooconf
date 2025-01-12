package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.PollVote;

import java.io.Serializable;

/**
 * DTO for {@link PollVote}
 */
public record PollVoteDto(Long id) implements Serializable {
}