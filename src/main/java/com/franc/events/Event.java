package com.franc.events;

import lombok.*;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

/**
 * Event 엔티티
 *   TODO : [INFO] 엔티티 생성 및 테스트
 *      1.필드선언 ('상태' 속성의 필드는 Enum 활용)
 *      2. 테스트 코드 작성
 *          - builder test : 빌더로 객체가 만들어지는지 테스트
 *          - JavaBean test : 디폴트생성자 + getter/setter로 객체가 만들어지는지 테스트
 *      * 롬복 어노테이션
 *          - 엔티티 클래스에 @Data 금지!
 *          - @EqualsAndHashCode(of = "id")
 *              . 보통은 id만 넣고 비교
 *              . 엔티티간에 상호참초 시 연관관계에 해당하는 필드는 추가하지 말 것!
 *      * 단축키
 *          - 테스트 클래스 생성 및 이동 (cmd + shift + t / ctrl + shift + t)
 *          - 중복코드 제거_로컬변수로 공통화 (alt + cmd + v)
 *          - 불필요한 import 삭제 (opt + ctrl + o / ctrl + alt + o)
 *
 */

@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter
public class Event {
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location; // (optional) 이게 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice; // (optional)
    private int limitOfEnrollment;
    private boolean offline;

    private boolean free;

    @Enumerated(EnumType.STRING)
    private EventStatus eventStatus = EventStatus.DRAFT;
}
