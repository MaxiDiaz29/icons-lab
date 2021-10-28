package com.icons.icons.service.impl;

import com.icons.icons.dto.CountryDTO;
import com.icons.icons.entity.CountryEntity;
import com.icons.icons.mapper.CountryMapper;
import com.icons.icons.repository.CountryRepository;
import com.icons.icons.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryMapper countryMapper;

    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<CountryDTO> getAll() {
        List<CountryEntity> entities = countryRepository.findAll();

        List<CountryDTO> dtos = this.countryMapper.listCountryEntity2DTO(entities, true);

        return dtos;
    }
}
