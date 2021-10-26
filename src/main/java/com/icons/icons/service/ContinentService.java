package com.icons.icons.service;

import com.icons.icons.dto.ContinentDTO;

import java.util.List;

public interface ContinentService {

    ContinentDTO save (ContinentDTO dto);

    List<ContinentDTO> getAll();

}
