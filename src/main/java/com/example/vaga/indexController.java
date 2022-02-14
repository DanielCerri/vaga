package com.example.vaga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	
	
	@RequestMapping(value = {"/","index"}, method=RequestMethod.GET)
	public ModelAndView abrirIndex() 
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping(value = "/busca", method=RequestMethod.POST)
	public ModelAndView retornaBusca(@RequestParam("buscar") String bsc, 
									@RequestParam("buscar2") String bsc2) 
	{
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("valor1", bsc);
		mv.addObject("valor2", bsc2);
		return mv;
	}
	
	

}
