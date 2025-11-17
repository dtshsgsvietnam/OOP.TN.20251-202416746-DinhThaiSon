package com.hust.kstn.models;

public class Media {
		private int id;
		private String title;
		private String type;
		private double cost;
		private static int nbMedia= 0;
		public String getTitle() {
			return title;
		}
		public String getType() {
			return type;
		}
		public int getId() {
		    return id;
		}
		public double getCost() {
			return cost;
		}

public Media (String title, String type, double cost) {
	this.id = ++nbMedia;
	this.title = title;
	this.type = type;
	this.cost = cost;
}

@Override
public String toString() {
	
	return "[" + this.id + "]" + " - " + "[" + this.title + "]" + " - " + "[" + this.cost + "]" + " - "
			+ "[" + this.type + "]";
}
}

