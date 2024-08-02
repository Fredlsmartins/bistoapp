package com.yourcompany.bistro.bistro_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yourcompany.bistro.bistro_app.domain.dto.dto.MunicipioDTO;

@Controller
public class UfController {
    @Autowired
  MunicipioDTO municipioDTO;

  @PostMapping ("/")
  public String cadastrar (@RequestBody MunicipioDTO municipioDTO) {
      return "";
  }
}
