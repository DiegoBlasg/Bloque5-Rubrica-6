package com.Bloque5Rubrica6.Bloque5Rubrica6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PersonRestController {


	private List<PersonDTO> list = new ArrayList<PersonDTO>();

    @PostMapping("/persistPerson")
    public ResponseEntity < String > persistPerson(@RequestBody PersonDTO person) {
        if (person.getFirstName().length() > 0 && person.getSecondName().length() > 0
				&& person.getDateOfBirth().length() > 0 && person.getProfession().length() > 0
				&& person.getSalary() > 0) {
                    list.add(person);
                    System.out.println(list);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}	