package com.hust.kstn.models;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	private String title;
	private String type;
	private String director;
	private int length;
	private double cost;
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public int getID() {
		return id;
	}
	public DigitalVideoDisc(String title, String type, String director, int length, double cost) {
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.type = type;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	 @Override
	    public String toString() {
	        return "DVD" + "[" + this.id + "] - "
	            + "[" + this.title + "] - "
	            + "[" + this.cost + "] - "
	            + "[" + this.length + "] - "
	            + "[" + this.type + "] - "
	            + "[" + this.director + "]";
	    }
}

