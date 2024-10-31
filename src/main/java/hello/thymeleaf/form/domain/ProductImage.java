package hello.thymeleaf.form.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductImage {
    private String imageUrl; // 이미지 경로
    private String altText; // 이미지 설명
}
