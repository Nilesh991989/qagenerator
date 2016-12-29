package com.ha.qagenerator.model;

import java.util.Map;

public class VCard {
	public static final String LINE_FEED = "\n";
    private static final String BEGIN_VCARD = "BEGIN:VCARD";
    private static final String NAME = "N";
    private static final String COMPANY = "ORG";
    private static final String TITLE = "TITLE";
    private static final String PHONE = "TEL";
    private static final String WEB = "URL";
    private static final String EMAIL = "EMAIL";
    private static final String ADDRESS = "ADR";
    private static final String NOTE = "NOTE";

    private String name;

    private String company;

    private String title;

    private String phoneNumber;

    private String email;

    private String address;

    private String website;

    private String note;

    public VCard() {
    }
    
    public String getName() {
        return name;
    }

    public VCard setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public VCard setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public VCard setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public VCard setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public VCard setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public VCard setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public VCard setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Returns the textual representation of this vcard of the form
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(BEGIN_VCARD).append(LINE_FEED);
        sb.append("VERSION:3.0").append(LINE_FEED);
        if (name != null) {
            sb.append(NAME).append(":").append(name);
        }
        if (company != null) {
            sb.append(LINE_FEED).append(COMPANY).append(":").append(company);
        }
        if (title != null) {
            sb.append(LINE_FEED).append(TITLE).append(":").append(title);
        }
        if (phoneNumber != null) {
            sb.append(LINE_FEED).append(PHONE).append(":").append(phoneNumber);
        }
        if (website != null) {
            sb.append(LINE_FEED).append(WEB).append(":").append(website);
        }
        if (email != null) {
            sb.append(LINE_FEED).append(EMAIL).append(":").append(email);
        }
        if (address != null) {
            sb.append(LINE_FEED).append(ADDRESS).append(":").append(address);
        }
        if (note != null) {
            sb.append(LINE_FEED).append(NOTE).append(":").append(note);
        }
        sb.append(LINE_FEED).append("END:VCARD");
        return sb.toString();
    }

}
