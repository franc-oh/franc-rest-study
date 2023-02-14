package com.franc.events;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EventController {

    /**
     * TODO : [INFO] Controller
     *      - WebMvcLinkBuilder 메소드로 uri 빌드
     *      - ResponseEntity
     */
    @PostMapping("/api/events")
    public ResponseEntity createEvent() {
        URI createdUri = linkTo(methodOn(EventController.class).createEvent()).slash("{id}").toUri();
        return ResponseEntity.created(createdUri).build();
    }
}
