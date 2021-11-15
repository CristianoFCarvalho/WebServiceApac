package com.webserviceapac.WebServiceApac.Controller;

import javax.validation.Valid;

import com.webserviceapac.WebServiceApac.Models.Apac;
import com.webserviceapac.WebServiceApac.Repository.ApacRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Apac")

public class ApacController {

	@Autowired
	private ApacRepository apacRepository;;

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Apac SalvarLaudoApac(@RequestBody @Valid Apac apac ) {

		return apacRepository.save(apac);

	}
}
	
