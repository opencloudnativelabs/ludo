package org.aditya.ludo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LudoController {

    @GetMapping("/")
    public ResponseEntity index(){
        return new ResponseEntity("Welcome to Dice Game", HttpStatus.OK);
    }

    @GetMapping("/dice")
    public int roll(){
        Double random = Math.random() * 100;
        Integer intData = random.intValue();

        if(intData>6){
            intData = intData - 6;
        }

        return intData;
    }
}
