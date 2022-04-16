package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @RequestMapping("/calculator")
    public String calculator(ModelMap model, @RequestParam(name = "number1",defaultValue ="0") double number1,@RequestParam(name = "number2",defaultValue = "0") double number2,@RequestParam(name = "calculation",defaultValue = "") String calculators){
      double result=0;
      switch (calculators){
          case "Addition(+)":
              result=number1+number2;
              calculators="Addition";
              break;
          case "Subtraction(-)":
              result=number1-number2;
              calculators="Subtraction";
              break;
          case "Multiplication(x)":
              result=number1*number2;
              calculators="Multiplication";
              break;
          case "Division(/)":
              result=number1/number2;
              calculators="Division";
              break;
      }
      model.addAttribute("number1",number1);
      model.addAttribute("number2",number2);
      model.addAttribute("calculators",calculators);
      model.addAttribute("result",result);
      return "index";
    }
}
