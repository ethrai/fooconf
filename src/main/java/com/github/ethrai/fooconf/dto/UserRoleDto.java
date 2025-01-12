package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.UserRole;

import java.io.Serializable;

/**
 * DTO for {@link UserRole}
 */
public record UserRoleDto(Long id, String name) implements Serializable {
}