package hello.thymeleaf.form.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    /* 기본적인 입력폼 처리 */
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    /* 체크박스, 라디오 버튼, 셀렉트 박스  */
    private Boolean open; //판매 여부
    private List<String> regions; //등록 지역
    private ItemType itemType; //상품 종류
    private String deliveryCode; //배송 방법

    private List<ProductImage> images; // 상품의 이미지 목록
}
