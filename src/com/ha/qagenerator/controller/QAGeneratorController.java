package com.ha.qagenerator.controller;

import javax.validation.Valid;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ha.qagenerator.model.req.VcardReqModel;
import com.ha.qagenerator.service.QRGeneratorService;
import com.ha.qagenerator.util.QRGenerator;

@RestController
public class QAGeneratorController {

	@Autowired
	QRGeneratorService qrGeneratorService;
	
	@RequestMapping(value="/generateqr/vcard",method=RequestMethod.POST,produces=MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<Byte[]> generateQRCodeVcard(@Valid @RequestBody VcardReqModel reqModel){
		qrGeneratorService.generateQRCodeForVCard(reqModel);
		//return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body();
		return null;
	}
	
	
}
