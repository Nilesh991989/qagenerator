package com.ha.qagenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ha.qagenerator.util.QRGenerator;

@RestController
public class QAGeneratorController {

	@Autowired
	QRGenerator qqrGenerator;
	
	@RequestMapping(value="generateqr/vcard")
	public void generateQRCodeVcard(){
		
	}
	
	
}
