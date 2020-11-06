package com.org.app;

public class Amenity {
	private String AmenityName;
	private String AmenityDescription;
	public Amenity() {
		super();
	}
	public Amenity(String amenityName, String amenityDescription) {
		super();
		AmenityName = amenityName;
		AmenityDescription = amenityDescription;
	}
	public String getAmenityName() {
		return AmenityName;
	}
	public void setAmenityName(String amenityName) {
		AmenityName = amenityName;
	}
	public String getAmenityDescription() {
		return AmenityDescription;
	}
	public void setAmenityDescription(String amenityDescription) {
		AmenityDescription = amenityDescription;
	}
	@Override
	public String toString() {
		return "Amenity [AmenityName=" + AmenityName + ", AmenityDescription=" + AmenityDescription + "]";
	}
	
}
