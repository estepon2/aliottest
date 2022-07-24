package com.aliostest.springboot.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Model.Operation;

@Controller
public class AddSubstractController {
	
	
	@GetMapping({"/", "index"})
	public ModelAndView  index() {
		return new ModelAndView("index", "operation", new Operation());
	}
	
	@PostMapping(value = "/caculateResult")
	public String submit(@Valid @ModelAttribute("operation")Operation operation, 
		      BindingResult result, ModelMap model) {
		int finalResult;
		
		if (result.hasErrors()) {
			model.addAttribute("errors", result.getFieldErrors().toString());
            return "error";
        }
		
		if(operation.getOperationType().equalsIgnoreCase("sum"))
			finalResult = operation.getFirtNumber() + operation.getSecondNumber();
		else
			finalResult = operation.getFirtNumber() - operation.getSecondNumber();
		
		model.addAttribute("finalResult", finalResult);
       
	    return "result";
	}


}
