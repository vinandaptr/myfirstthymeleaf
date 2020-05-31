package com.vinan.myfirstthymeleaf.controller.restapi;


import com.vinan.myfirstthymeleaf.model.dto.BiodataDto;
import com.vinan.myfirstthymeleaf.model.entity.Biodata;
import com.vinan.myfirstthymeleaf.repository.BiodataRepository;
import com.vinan.myfirstthymeleaf.service.BiodataService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/biodata")
public class ApiBiodata {
    @Autowired
    private BiodataRepository biodataRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BiodataService biodataService;

    @GetMapping()
    public List<BiodataDto> getListBiodata() {
        List<Biodata> biodataList = biodataRepository.findAll();
        List<BiodataDto> biodataDtos =
                biodataList.stream()
                        .map(biodata -> modelMapper.map(biodata, BiodataDto.class))
                        .collect(Collectors.toList());
        return biodataDtos;
    }

    @GetMapping("/{idAja}")
    public BiodataDto getBiodata(@PathVariable Integer idAja) {
        Biodata biodata = biodataRepository.findById(idAja).get();
        BiodataDto biodataDto = new BiodataDto();
        biodataDto.setId(biodata.getId());
        biodataDto.setFullName(biodata.getFullName());
        biodataDto.setEmail(biodata.getEmail());
        biodataDto.setPhone(biodata.getPhone());
        biodataDto.setAddress(biodata.getAddress());
        biodataDto.setBirthday(biodata.getBirthday());
        biodataDto.setIdCard(biodata.getIdCard());
        biodataDto.setUniv(biodata.getUniv());
        biodataDto.setMajor(biodata.getMajor());
        biodataDto.setGpa(biodata.getGpa());
        biodataDto.setCover(biodata.getCover());
        biodataDto.setHobby(biodata.getHobby());
        biodataDto.setGender(biodata.getGender());
        biodataDto.setReligion(biodata.getReligion());
        
        biodataDto.setGolonganDarah(biodata.getDetailBiodata().getGolonganDarah());
        biodataDto.setTempatLahir(biodata.getDetailBiodata().getTempatLahir());

        return biodataDto;
    }

    @PostMapping
    public Biodata editSaveBiodata(@RequestBody Biodata biodata) {
        biodataRepository.save(biodata);
        return biodata;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        biodataRepository.deleteById(Integer.parseInt(id));
    }

    @GetMapping("/transaksi")
    public Biodata latTransactional() {
        Biodata biodata = biodataService.latTransactional();

        return biodata;
    }
}
