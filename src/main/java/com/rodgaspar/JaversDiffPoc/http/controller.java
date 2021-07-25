package com.rodgaspar.JaversDiffPoc.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pocdiff")
@Slf4j
public class controller {

    @GetMapping
    public ResponseEntity<String> trataGet(){

        log.info("Iniciando processamento!");

        return new ResponseEntity<>("Executado com sucesso!", HttpStatus.OK);
    }
}
