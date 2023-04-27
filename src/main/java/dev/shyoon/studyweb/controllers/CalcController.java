package dev.shyoon.studyweb.controllers;

import dev.shyoon.studyweb.vos.CalcVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//어노테이션
@Controller
@RequestMapping(value = "calc")
//폴더 이름지정 //주소라고 생각 http://localhost:6795/calc 클래스에 적용되었기 때문에 해당 클래스의 내의 모든 맵핑에 접두어 같은 역할을 한다.
public class CalcController {
    @RequestMapping(value = "/", method = RequestMethod.GET)  //  ~/calc/
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("calc/index");
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView postIndex(CalcVo calcVo) {
        int result = -1;
        switch (calcVo.getOperator()) {
            case "+":
                result = calcVo.getA() + calcVo.getB();
                break;
            case "-":
                result = calcVo.getA() - calcVo.getB();
                break;
            case "*":
                result = calcVo.getA() * calcVo.getB();
                break;
            case "/":
                result = calcVo.getA() / calcVo.getB();
                break;
            case "%":
                result = calcVo.getA() % calcVo.getB();
                break;
        }
        ModelAndView modelAndView = new ModelAndView("calc/index");
        modelAndView.addObject("calcVo", calcVo);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}

