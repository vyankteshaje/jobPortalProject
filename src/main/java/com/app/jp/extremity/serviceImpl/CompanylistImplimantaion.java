package com.app.jp.extremity.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.jp.extremity.model.CompanyRegistration;
import com.app.jp.extremity.repository.CompanylistRepository;
import com.app.jp.extremity.serviceI.CompanylistInterface;


@Service
public class CompanylistImplimantaion implements CompanylistInterface{
@Autowired
CompanylistRepository repository;
	@Override
	public List<CompanyRegistration> getCopanyRegister() {
		// TODO Auto-generated method stub
		return (List <CompanyRegistration>) repository.findAll();
	}

}
