package com.icons.icons.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class IconDTO {

    private Long id;
    private String picture;
    private String denomination;
    private LocalDate creationDate;
    private Long height;
    private String history;
    private List<CountryDTO> countries;

}
