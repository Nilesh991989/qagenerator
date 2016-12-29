package com.ha.qagenerator.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.ha.qagenerator.mapper.VCardReqToVCard;
import com.ha.qagenerator.model.VCard;
import com.ha.qagenerator.model.req.VcardReqModel;
import com.ha.qagenerator.util.QRGenerator;

@Component
public class QRGeneratorService {
	
	@Autowired
	QRGenerator qrGenerator;

	public void generateQRCodeForVCard(VcardReqModel reqModel) {
		VCardReqToVCard mapper = new VCardReqToVCard();
		VCard vcard = mapper.mapVCardReqToVcard(reqModel);
		try {
			qrGenerator.gene(vcard.toString());
		} catch (NotFoundException | WriterException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

