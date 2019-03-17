package com.app.jp.extremity.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.jp.extremity.model.CompanyRegistration;
import com.app.jp.extremity.serviceImpl.CompanylistImplimantaion;



@CrossOrigin("*")
@RestController
public class CompanylistController {
	
	@Autowired
	CompanylistImplimantaion ci;
	@ResponseBody
	@RequestMapping(value="/get",method=RequestMethod.GET ,produces="application/json")
	public List<CompanyRegistration>getCopanyRegister(){
		System.out.println("enter int controller");
		List<CompanyRegistration>cr=ci.getCopanyRegister();
		System.out.println(cr);
		return cr;
		
		
		
		
	}
}
