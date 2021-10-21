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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String picture;

    private String denomination;

}
