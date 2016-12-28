package com.ha.qagenerator.controller;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ha.qagenerator.model.req.VcardReqModel;
import com.ha.qagenerator.util.QRGenerator;

@RestController
public class QAGeneratorController {

	@Autowired
	QRGenerator qqrGenerator;
	
	@RequestMapping(value="generateqr/vcard",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void generateQRCodeVcard(@RequestBody VcardReqModel reqModel){
		System.out.println(reqModel);
	}
	
	
}
