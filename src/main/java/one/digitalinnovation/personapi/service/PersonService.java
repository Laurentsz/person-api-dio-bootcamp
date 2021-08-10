package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.PersonDTO;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public MessageResponseDTO newPerson(PersonDTO personDTO){
        PersonDTO savedPersonDTO =  personRepository.save(personDTO);
        return MessageResponseDTO
                .builder()
                .message("Created Person, ID #" + savedPersonDTO.getId())
                .build();
    }
}
