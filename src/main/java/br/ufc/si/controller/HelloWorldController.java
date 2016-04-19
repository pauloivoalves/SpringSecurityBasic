package br.ufc.si.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping(value = { "/"})
	public String homePage(ModelMap model) {
		model.addAttribute("Teste", "Hello World. ");
		return "welcome";
	}

}
