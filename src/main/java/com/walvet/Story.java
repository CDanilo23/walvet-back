package com.walvet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Story {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
//    private String specie;
//    private Date fecha;
//    private String race;
//    private String colour;
//    private String gender;
//    private String bornDate;
//    private String age;
//    private String story;
//    private String owner;
//    private String adress;
//    private String phone;
//    private String anamesis;
//    private String actitude;
    
	public Story(String name) {
		super();
		this.name = name;
	}

	public Story() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	/**
//	 * @return the specie
//	 */
//	public String getSpecie() {
//		return specie;
//	}
//
//	/**
//	 * @param specie the specie to set
//	 */
//	public void setSpecie(String specie) {
//		this.specie = specie;
//	}
//
//	/**
//	 * @return the fecha
//	 */
//	public Date getFecha() {
//		return fecha;
//	}
//
//	/**
//	 * @param fecha the fecha to set
//	 */
//	public void setFecha(Date fecha) {
//		this.fecha = fecha;
//	}
//
//	/**
//	 * @return the race
//	 */
//	public String getRace() {
//		return race;
//	}
//
//	/**
//	 * @param race the race to set
//	 */
//	public void setRace(String race) {
//		this.race = race;
//	}
//
//	/**
//	 * @return the colour
//	 */
//	public String getColour() {
//		return colour;
//	}
//
//	/**
//	 * @param colour the colour to set
//	 */
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//
//	/**
//	 * @return the gender
//	 */
//	public String getGender() {
//		return gender;
//	}
//
//	/**
//	 * @param gender the gender to set
//	 */
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	/**
//	 * @return the bornDate
//	 */
//	public String getBornDate() {
//		return bornDate;
//	}
//
//	/**
//	 * @param bornDate the bornDate to set
//	 */
//	public void setBornDate(String bornDate) {
//		this.bornDate = bornDate;
//	}
//
//	/**
//	 * @return the age
//	 */
//	public String getAge() {
//		return age;
//	}
//
//	/**
//	 * @param age the age to set
//	 */
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//	/**
//	 * @return the story
//	 */
//	public String getStory() {
//		return story;
//	}
//
//	/**
//	 * @param story the story to set
//	 */
//	public void setStory(String story) {
//		this.story = story;
//	}
//
//	/**
//	 * @return the owner
//	 */
//	public String getOwner() {
//		return owner;
//	}
//
//	/**
//	 * @param owner the owner to set
//	 */
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//	/**
//	 * @return the adress
//	 */
//	public String getAdress() {
//		return adress;
//	}
//
//	/**
//	 * @param adress the adress to set
//	 */
//	public void setAdress(String adress) {
//		this.adress = adress;
//	}
//
//	/**
//	 * @return the phone
//	 */
//	public String getPhone() {
//		return phone;
//	}
//
//	/**
//	 * @param phone the phone to set
//	 */
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	/**
//	 * @return the anamesis
//	 */
//	public String getAnamesis() {
//		return anamesis;
//	}
//
//	/**
//	 * @param anamesis the anamesis to set
//	 */
//	public void setAnamesis(String anamesis) {
//		this.anamesis = anamesis;
//	}
//
//	/**
//	 * @return the actitude
//	 */
//	public String getActitude() {
//		return actitude;
//	}
//
//	/**
//	 * @param actitude the actitude to set
//	 */
//	public void setActitude(String actitude) {
//		this.actitude = actitude;
//	}
}
