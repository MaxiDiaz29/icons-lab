package com.icons.icons.mapper;

import com.icons.icons.dto.CountryDTO;
import com.icons.icons.entity.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMapper {

    @Autowired
    private IconMapper iconMapper;

    @Autowired
    private ContinentMapper continentMapper;

    public CountryDTO countryEntity2DTO (CountryEntity entity){
        CountryDTO dto = new CountryDTO();

        if(entity != null){
            dto.setArea(entity.getArea());
            if(entity.getContinentEntity() != null){
                dto.setContinent(this.continentMapper.continentEntity2DTO(entity.getContinentEntity()));
            }
            dto.setDenomination(entity.getDenomination());
            dto.setId(entity.getId());
            dto.setArea(entity.getArea());
            dto.setNumberInhabitants(entity.getNumberInhabitants());

            dto.setIcons(this.iconMapper.iconEntitySet2DTO(entity.getIcons()));

        }

        return dto;
    }


    public List<CountryEntity> listCountryDTO2Entity (List<CountryDTO> dtos, boolean loadIcons){
        List<CountryEntity> entities = new ArrayList<>();

        for(CountryDTO dto : dtos){

        }

        return entities;
    }

    public List<CountryDTO> listCountryEntity2DTO(List<CountryEntity>entities, boolean loadIcons){
        List<CountryDTO> dtos = new ArrayList<>();

        return dtos;
    }

}
