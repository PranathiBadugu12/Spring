package com.org.app;

import java.time.LocalTime;
import java.util.List;

public class Vendor extends User{
	private String name;
	private String description;
	private LocalTime openingTime;
	private LocalTime closingTime;
	private List<File> images;
	private List<Bookable> offers;
	private List<Amenity> amenities;
	public Vendor() {
		super();
	}
	public Vendor(String email, String password, String phonenumber, Address address, boolean verified, List<Role> roles,
			boolean enabled,String name, String description, LocalTime openingTime, LocalTime closingTime, List<File> images,
			List<Bookable> offers, List<Amenity> amenities) {
		super( email,  password,  phonenumber,  address,  verified,  roles, enabled);
		this.name = name;
		this.description = description;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.images = images;
		this.offers = offers;
		this.amenities = amenities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalTime getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}
	public LocalTime getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}
	public List<File> getImages() {
		return images;
	}
	public void setImages(List<File> images) {
		this.images = images;
	}
	public List<Bookable> getOffers() {
		return offers;
	}
	public void setOffers(List<Bookable> offers) {
		this.offers = offers;
	}
	public List<Amenity> getAmenities() {
		return amenities;
	}
	public void setAmenities(List<Amenity> amenities) {
		this.amenities = amenities;
	}
	@Override
	public String toString() {
		return "Vendor [name=" + name + ", description=" + description + ", openingTime=" + openingTime
				+ ", closingTime=" + closingTime + ", images=" + images + ", offers=" + offers + ", amenities="
				+ amenities + "]";
	}
	
	
}
