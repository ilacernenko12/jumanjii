package com.overone.first_spring_mvs_project.controller;

import com.overone.first_spring_mvs_project.models.SparePart;
import com.overone.first_spring_mvs_project.repos.SparePartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping ("/sparepart")
public class SparePartController {
    @Autowired
    SparePartRepo sparePartRepo;

    @GetMapping
    public String getSparePart(){
        return "sparepart";
    }

    @PostMapping
    public RedirectView setSparePart(@RequestParam String name,
                                     @RequestParam String sparepart,
                                     @RequestParam String vin,
                                     @RequestParam String price){
        SparePart sparePart = new SparePart();
        sparePart.setName(name);
        sparePart.setSparepart(sparepart);
        sparePart.setVin(vin);
        sparePart.setPrice(price);
        sparePart.setPrice(price);

        sparePartRepo.save(sparePart);
        return new RedirectView("/");
    }
}
