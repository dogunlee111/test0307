package kr.ac.kopo.test0307.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @ + RestController를 해주어야 컨트롤러로써의 역활을 수행한다.
public class SampleController {
    @GetMapping("/hello")
    public String[] hello() {
        return new String[]{"Hello", "World"};
    }
}
