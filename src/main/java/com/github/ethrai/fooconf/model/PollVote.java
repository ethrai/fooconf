package com.github.ethrai.fooconf.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PollVote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "poll_vote_id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "poll_option_id", nullable = false)
    private PollOption pollOption;

    @ManyToOne
    @JoinColumn(name = "participant_id", nullable = false)
    private Participant participant;

}
