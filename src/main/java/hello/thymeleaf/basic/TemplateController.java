package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/fragment") // 템플릿 조각
    public String template() {
        return "template/fragment/fragmentMain";
    }

    @GetMapping("/layout") // 유연한 레이아웃
    public String layout() {
        return "template/layout/layoutMain";
    }

    @GetMapping("/layoutExtend") // 레이아웃 상속
    public String layoutExtend() {
        return "template/layoutExtend/layoutExtendMain";
    }
}
