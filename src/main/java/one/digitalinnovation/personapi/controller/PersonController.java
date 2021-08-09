package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public MessageResponseDTO newPerson(@RequestBody Person person){
        Person savedPerson =  personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created Person, ID #" + savedPerson.getId())
                .build();
    }
}
