package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.User;

import java.io.Serializable;
import java.sql.Date;

/**
 * DTO for {@link User}
 */
public record UserDto(Long id, String firstName, String lastName, String email, Date createdAt,
                      Date updatedAt) implements Serializable {
}