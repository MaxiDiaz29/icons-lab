package com.icons.icons.controller;

import com.icons.icons.dto.CountryDTO;
import com.icons.icons.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("countries")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping
    public ResponseEntity<List<CountryDTO>> getAll(){
        List<CountryDTO> countryDTOS = countryService.getAll();

        return ResponseEntity.ok().body(countryDTOS);
    }

}
