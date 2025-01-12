package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.Recording;

import java.io.Serializable;

/**
 * DTO for {@link Recording}
 */
public record RecordingDto(Long id, String url) implements Serializable {
}