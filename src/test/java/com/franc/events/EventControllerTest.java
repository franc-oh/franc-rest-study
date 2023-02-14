package com.franc.events;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TODO : [INFO] 컨트롤러 테스트
 *      1. @WebMvcTest
 *          - WebMvc 빈을 자동설정
 *          - 웹 관련 빈만 등록
 *      2. MockMvc
 *          - 웹 서버를 띄우지 않고 MVC 테스트 (처리 과정을 볼 수 있기 때문에 컨트롤러 테스트용으로 자주 쓰임)
 *      3. MockMvc를 통해 MVC 테스트 코드 빌드하는 방법
 *      
 */

@RunWith(SpringRunner.class)
@WebMvcTest
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("1_정상적으로 이벤트를 생성하는 테스트")
    public void eventCreated() throws Exception {
        mockMvc.perform(post("/api/events")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaTypes.HAL_JSON)
        ).andExpect(status().isCreated());
    }
}
