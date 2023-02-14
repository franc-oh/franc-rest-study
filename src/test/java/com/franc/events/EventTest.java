package com.franc.events;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

    @Test
    @DisplayName("Event객체_Builder_생성이_가능한가")
    public void builder() {
        Event event = Event.builder()
                .name("name kim")
                .description("Description AAA")
                .build();

        assertThat(event).isNotNull();
    }

    @Test
    @DisplayName("Event객체_JavaBean_스팩을_준수하는가")
    public void javabean() {
        // given
        String name = "kim";
        String description = "AAAAAA";

        // when
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }

}