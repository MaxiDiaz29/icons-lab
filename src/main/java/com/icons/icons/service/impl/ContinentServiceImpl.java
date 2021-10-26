package com.icons.icons.service.impl;


import com.icons.icons.dto.ContinentDTO;
import com.icons.icons.entity.ContinentEntity;
import com.icons.icons.mapper.ContinentMapper;
import com.icons.icons.repository.ContinentRepository;
import com.icons.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {

    @Autowired
    private ContinentMapper mapper;

    @Autowired
    private ContinentRepository repository;

    @Override
    public ContinentDTO save(ContinentDTO dto) {
        ContinentEntity entity = this.mapper.continentDTO2Entity(dto);

        ContinentEntity entitySaved = this.repository.save(entity);

        ContinentDTO dtoResult = this.mapper.continentEntity2DTO(entitySaved);

        return dtoResult;
    }

    @Override
    public List<ContinentDTO> getAll(){
        List<ContinentEntity> entities = this.repository.findAll();

        List<ContinentDTO> dtos = this.mapper.listContinentEntity2listDTO(entities);

        return dtos;
    }
}
