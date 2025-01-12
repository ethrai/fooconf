package com.github.ethrai.fooconf.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Recording {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recording_id")
    private Long id;

    @Column(nullable = false)
    private String url;

    @OneToOne(mappedBy = "recording", cascade = CascadeType.ALL)
    private Conference conference;
}
