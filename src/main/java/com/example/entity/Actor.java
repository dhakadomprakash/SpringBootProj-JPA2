package com.example.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@Table(name = "actor_details")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Actor {
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @NonNull
    @Column(name = "actor_name")
    private String actName;
    @NonNull
    @Column(name = "actor_number")
    private Long actorNumber;
    @NonNull
    private String actorDesignation;
}
