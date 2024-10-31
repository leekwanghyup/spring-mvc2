package hello.thymeleaf.form.domain;

import lombok.*;

/*
* FAST : 빠른 배송
* NORMAL : 일반 배송
* SLOW : 느린배송
* */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DeliveryCode {
    private String code; // FAST, NORMAL, SLOW
    private String displayName; // 고객에게 내용 설명
}
