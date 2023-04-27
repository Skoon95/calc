package dev.shyoon.studyweb.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "memo") //http://localhost:6795/memo //명명규칙:templates밑에폴더 이름 (memo)
public class MemoController {
//    @RequestMapping(value = "print",produces = MediaType.TEXT_PLAIN_VALUE) //http://localhost:6795/memo/print
//    @ResponseBody
//    public String getPrint(@RequestParam(value = "message",required = false,defaultValue = "Default Message")String message){
//        return message;
//    }
    @RequestMapping(value = "write",method = RequestMethod.GET) //명명규칙 : html 이름(write) =클래스의 이름(memo)밑의 html 이름
    public ModelAndView getWrite(){  //명명규칙 : get or post 방식+ 기능이름
        System.out.println("getWrite()");
        ModelAndView modelAndView = new ModelAndView("memo/write"); //memo/write ctrl 클릭으로 확인하기
        return modelAndView;
    }
    @RequestMapping(value = "write",method = RequestMethod.POST)
    public ModelAndView postWrite(@RequestParam(value = "text",required = false)String text){
        System.out.printf("postWrite(%s)\n ",text);
        ModelAndView modelAndView = new ModelAndView("memo/write"); //memo/write ctrl 클릭으로 확인하기
        return modelAndView;
    }
}
