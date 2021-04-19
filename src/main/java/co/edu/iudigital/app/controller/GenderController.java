package co.edu.iudigital.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.model.entity.Gender;
import co.edu.iudigital.app.service.iface.GenderService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class GenderController {
	
	//Inyección de dependencia desde el  service
	@Autowired
	private GenderService genderService;
	@GetMapping
	@RequestMapping(value="/gender", method = RequestMethod.GET)
	public List<Gender> getAll(){
		
		return genderService.getAll();
	
	}
}
