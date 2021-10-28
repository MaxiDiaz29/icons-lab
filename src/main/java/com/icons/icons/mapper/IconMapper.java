package com.icons.icons.mapper;

import com.icons.icons.dto.IconDTO;
import com.icons.icons.entity.IconEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class IconMapper {

    @Autowired
    CountryMapper countryMapper;

    public IconEntity iconDTO2Entity(IconDTO dto, boolean loadCountries){
        IconEntity entity = new IconEntity();

        if(dto != null){
            entity.setId(dto.getId());
            entity.setHeight(dto.getHeight());
            entity.setHistory(dto.getHistory());
            entity.setDenomination(dto.getDenomination());
            entity.setPicture(dto.getPicture());
            if(loadCountries){
                entity.setCountries(this.countryMapper.listCountryDTO2Entity(dto.getCountries(), false));
            }
        }

        return entity;
    }

    public IconDTO iconEntity2DTO(IconEntity entity, boolean loadCountries){
        IconDTO dto = new IconDTO();

        if(entity != null){
            dto.setPicture(entity.getPicture());
            dto.setId(entity.getId());
            dto.setDenomination(entity.getDenomination());
            dto.setCreationDate(entity.getCreationDate());
            dto.setHistory(entity.getHistory());
            dto.setHeight(entity.getHeight());
            if(loadCountries){
                dto.setCountries(this.countryMapper.listCountryEntity2DTO(entity.getCountries(), false));
            }
        }

        return dto;
    }

    public List<IconDTO> iconEntitySet2DTO(Set<IconEntity> entities){
        List<IconDTO> dtos = new ArrayList<>();

        if(entities != null) {
            for (IconEntity entity : entities) {
                dtos.add(this.iconEntity2DTO(entity, false));
            }
        }
        return dtos;
    }

    public Set<IconEntity> iconDTOList2Entity (List<IconDTO> dtos){
        Set<IconEntity> entities = new HashSet<>();


        if(dtos != null) {
            for (IconDTO dto : dtos) {
                entities.add(this.iconDTO2Entity(dto, false));
            }
        }
        return entities;
    }
}
