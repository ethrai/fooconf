package com.github.ethrai.fooconf.dto;

import com.github.ethrai.fooconf.model.File;

import java.io.Serializable;

/**
 * DTO for {@link File}
 */
public record FileDto(Long id, String url) implements Serializable {
}