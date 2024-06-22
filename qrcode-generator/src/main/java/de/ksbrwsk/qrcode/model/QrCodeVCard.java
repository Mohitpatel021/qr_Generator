package de.ksbrwsk.qrcode.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

/**
 * BEGIN:VCARD
 * VERSION:3.0
 * N:Gump;Forrest;;Mr.;
 * FN:Forrest Gump
 * ORG:Bubba Gump Shrimp Co.
 * TITLE:Shrimp Man
 * PHOTO;MEDIATYPE=image/gif:http://www.example.com/dir_photos/my_photo.gif
 * TEL;TYPE=work,voice;VALUE=uri:tel:+1-111-555-1212
 * TEL;TYPE=home,voice;VALUE=uri:tel:+1-404-555-1212
 * ADR;TYPE=WORK;PREF=1;LABEL="100 Waters Edge\nBaytown\, LA 30314\nUnited States of America":;;100 Waters Edge;Baytown;LA;30314;United States of America
 * ADR;TYPE=HOME;LABEL="42 Plantation St.\nBaytown\, LA 30314\nUnited States of America":;;42 Plantation St.;Baytown;LA;30314;United States of America
 * EMAIL:forrestgump@example.com
 * REV:20080424T195243Z
 * x-qq:21588891
 * END:VCARD
 */
@Getter
@Setter
@Validated
public class QrCodeVCard {

    @NotEmpty
    private String name;

    @NotEmpty
    private String lastname;
    private String organisation;
    private String title;
    private String phone1;
    private QrCodeEnumType phone1Type = QrCodeEnumType.WORK;

    private String adress1Street;
    private String adress1Locality;
    private String adress1Region;
    private String adress1PostalCode;
    private String adress1Country;
    private QrCodeEnumType adress1Type = QrCodeEnumType.WORK;

    private String email1;
    private String email2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public QrCodeEnumType getPhone1Type() {
		return phone1Type;
	}
	public void setPhone1Type(QrCodeEnumType phone1Type) {
		this.phone1Type = phone1Type;
	}
	public String getAdress1Street() {
		return adress1Street;
	}
	public void setAdress1Street(String adress1Street) {
		this.adress1Street = adress1Street;
	}
	public String getAdress1Locality() {
		return adress1Locality;
	}
	public void setAdress1Locality(String adress1Locality) {
		this.adress1Locality = adress1Locality;
	}
	public String getAdress1Region() {
		return adress1Region;
	}
	public void setAdress1Region(String adress1Region) {
		this.adress1Region = adress1Region;
	}
	public String getAdress1PostalCode() {
		return adress1PostalCode;
	}
	public void setAdress1PostalCode(String adress1PostalCode) {
		this.adress1PostalCode = adress1PostalCode;
	}
	public String getAdress1Country() {
		return adress1Country;
	}
	public void setAdress1Country(String adress1Country) {
		this.adress1Country = adress1Country;
	}
	public QrCodeEnumType getAdress1Type() {
		return adress1Type;
	}
	public void setAdress1Type(QrCodeEnumType adress1Type) {
		this.adress1Type = adress1Type;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
    
    
}
