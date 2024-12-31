package kr.ilf.kshoong.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest")
public class TestRestController {

    @GetMapping("getGifNum")
    public String getGif(@RequestParam int num){
        return "/images/t"+num+".gif";
    }

    @GetMapping("getGif")
    public String getGif(@RequestParam String name){
        if(name.equals("기본")){
            return "/images/기본.gif";
        }
        return "/images/"+name+".png";
    }
}
