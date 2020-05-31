package com.vinan.myfirstthymeleaf.controller.restapi;

import com.vinan.myfirstthymeleaf.model.entity.DetailBiodata;
import com.vinan.myfirstthymeleaf.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detail")
public class ApiDetail {
    @Autowired
    private DetailRepository detailRepository;

    @GetMapping
    public List<DetailBiodata> getAll() {

        return detailRepository.findAll();
    }

    @PostMapping
    public DetailBiodata save(@RequestBody DetailBiodata detailBiodata) {

        return detailRepository.save(detailBiodata);
    }

    @GetMapping("/{golonganDarah}")
    public List<DetailBiodata> getByGolonganDarah(@PathVariable String golonganDarah) {
        return detailRepository.findAllByGolonganDarah(golonganDarah);
    }
}
