package com.icons.icons.mapper;

import com.icons.icons.dto.ContinentDTO;
import com.icons.icons.entity.ContinentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentMapper {

    public ContinentEntity continentDTO2Entity(ContinentDTO dto){
        ContinentEntity entity = new ContinentEntity();

        if(dto != null) {
            entity.setDenomination(dto.getDenomination());
            entity.setPicture(dto.getPicture());
        }

        return entity;
    }

    public ContinentDTO continentEntity2DTO(ContinentEntity entity){
        ContinentDTO dto = new ContinentDTO();

        if(entity != null) {
            dto.setDenomination(entity.getDenomination());
            dto.setId(entity.getId());
            dto.setPicture(entity.getPicture());
        }
        return dto;
    }

    public List<ContinentDTO> listContinentEntity2listDTO(List<ContinentEntity>entities){
        List<ContinentDTO> dtos = new ArrayList<>();

        for(ContinentEntity entity : entities){
            dtos.add(this.continentEntity2DTO(entity));
        }

        return dtos;
    }

}
