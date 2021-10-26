package com.icons.icons.controller;

import com.icons.icons.dto.ContinentDTO;
import com.icons.icons.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("continents")
public class ContinentController {

    @Autowired
    private ContinentService service;

    @PostMapping
    public ResponseEntity<ContinentDTO> save (@RequestBody ContinentDTO dto){
        ContinentDTO continentSaved = this.service.save(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(continentSaved);
    }

    @GetMapping
    public ResponseEntity<List<ContinentDTO>> getAll(){
        List<ContinentDTO> dtos = this.service.getAll();

        return ResponseEntity.ok().body(dtos);
    }


}
