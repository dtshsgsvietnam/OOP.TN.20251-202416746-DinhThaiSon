package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
	 private int length;
	    private String director;

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}


	public DigitalVideoDisc( String title, String type, String director, int length, double cost) {

		super( title, type, cost);
		this.director = director;
		this.length = length;
	}
@Override
    public String toString() {
        return super.toString()
            + " - " + "[" + this.director + "]" + " - " + "[" + this.length + "]";
    }
}

