package com.declercq.messagie.calculatrice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatriceController {

    ///http://localhost:8080/max?p1=?&p2=?
    @GetMapping("/max")
    public int getMax(@RequestParam(value = "p1", defaultValue = "0") int note,
                      @RequestParam(value = "p2", defaultValue = "0") int note2) {
        return Math.max(note, note2);
    }

}
