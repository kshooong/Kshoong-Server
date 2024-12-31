package kr.ilf.kshoong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping("clothTestWithButton")
    public String clothTestWithButton(Model model){
        model.addAttribute("data", "kshoong");
        String[] imgs = {"기본", "누더기", "루돌프", "밀짚모자", "빨간조끼", "수경", "수모", "운동복", "병아리모자", "오리튜브", "미니가방", "파랑옷", "개구리모자", "개구리목도리", "묘기공머리띠"};
        model.addAttribute("imgs", imgs);
        return "clothTestWithButton";
    }

    @GetMapping("clothTest")
    public String clothTest(){
        return "clothTest";
    }

    @GetMapping("syncTest")
    public String hello(Model model){
        model.addAttribute("data", "kshoong");
        return "syncTest";
    }
}
