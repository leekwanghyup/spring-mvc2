package hello.thymeleaf.form;

import ch.qos.logback.core.model.Model;
import hello.thymeleaf.form.domain.DeliveryCode;
import hello.thymeleaf.form.domain.Item;
import hello.thymeleaf.form.domain.ItemType;
import hello.thymeleaf.form.domain.ProductImage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/form/items")
public class FormItemController {

    @GetMapping("/add") // 기본적인 폼 입력 처리
    public String addForm(Item item, Model model) {
        return "form/addForm";
    }
    @PostMapping("/add")
    public String addItem(Item item) {
        System.out.println("item = " + item);
        return "form/addForm";
    }

    @ModelAttribute("regions") // 멀티 체크 박스
    public Map<String, String> regions() {
        Map<String, String> regions = new LinkedHashMap<>();
        regions.put("SEOUL", "서울");
        regions.put("BUSAN", "부산");
        regions.put("JEJU", "제주");
        return regions;
    }

    @ModelAttribute("itemTypes") // 라디오 버튼
    public ItemType[] itemTypes() {
        return ItemType.values();
    }
    
    @ModelAttribute("deliveryCodes") // 셀렉트 박스
    public List<DeliveryCode> deliveryCodes() {
        List<DeliveryCode> deliveryCodes = new ArrayList<>();
        deliveryCodes.add(new DeliveryCode("FAST", "빠른 배송"));
        deliveryCodes.add(new DeliveryCode("NORMAL", "일반 배송"));
        deliveryCodes.add(new DeliveryCode("SLOW", "느린 배송"));
        return deliveryCodes;
    }

    @ModelAttribute("images") // 중첩객체를 리스트로 가질 때
    public List<ProductImage> images() {
        List<ProductImage> images = new ArrayList<>();
        images.add(new ProductImage("경로1","설명1"));
        images.add(new ProductImage("경로2","설명2"));
        images.add(new ProductImage("경로3","설명3"));
        return images;
    }


}
