package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.Participant;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Participant}
 */
public record ParticipantDto(Long id, LocalDateTime invitedAt, LocalDateTime joinedAt,
                             LocalDateTime leftAt, ParticipantRoleDto role) implements Serializable {
}