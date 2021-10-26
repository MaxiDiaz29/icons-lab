package com.icons.icons.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "continent")
@Getter
@Setter
public class ContinentEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String picture;

    @Column
    private String denomination;

}
