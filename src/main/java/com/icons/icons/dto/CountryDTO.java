package com.icons.icons.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class CountryDTO {
    private Long id;
    private String denomination;
    private Long numberInhabitants;
    private Long area;
    private ContinentDTO continent;
    private Long continentId;
    private Set icons;

}
