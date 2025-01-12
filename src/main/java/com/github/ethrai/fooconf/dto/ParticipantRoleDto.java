package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.ParticipantRole;

import java.io.Serializable;

/**
 * DTO for {@link ParticipantRole}
 */
public record ParticipantRoleDto(Long id, String name) implements Serializable {
}