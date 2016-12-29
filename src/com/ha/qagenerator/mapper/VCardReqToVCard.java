package com.ha.qagenerator.mapper;

import com.ha.qagenerator.model.VCard;
import com.ha.qagenerator.model.req.VcardReqModel;

public class VCardReqToVCard {
	
	public VCard mapVCardReqToVcard(VcardReqModel reqModel){
		VCard vcard = new VCard();
		vcard.setName(reqModel.getName());
		vcard.setTitle(reqModel.getTitle());
		vcard.setEmail(reqModel.getEmail());
		vcard.setCompany(reqModel.getCompany());
		vcard.setAddress(reqModel.getAddr());
		vcard.setPhoneNumber(reqModel.getMnumber());
		vcard.setWebsite(reqModel.getWebsite());
		vcard.setNote(reqModel.getNote());
		return vcard;
	}

}
