package com.hust.kstn.models;

public class BookAuthor {
	private String fullName;
	private int yearOfBirth;
	private String shortBiography;
	public String getfullName() {
		return fullName;
	}
	public String getshortBiography() {
		return shortBiography;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public BookAuthor(String fullname, int yearOfBirth, String shortBiography) {
		this.fullName = fullname;
		this.yearOfBirth = yearOfBirth;
		this.shortBiography = shortBiography;
	}
	@Override
	public String toString() {
	 return this.fullName + " (" 
	 + this.yearOfBirth + ", "
	 + this.shortBiography + ")\n";
	}

}
