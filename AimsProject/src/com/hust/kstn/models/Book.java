package com.hust.kstn.models;

public class Book  {
	private int id;
	private String title;
	private String type;
	private double cost;
	private BookAuthor[] authors = new BookAuthor[10];
	private int AuthorCount = 0;
	private int NumOfTokens;
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}

	public double getCost() {
		return cost;
	}
	public int getID() {
		return id;
	}
	public int getNumOfTokens() {
        return NumOfTokens;
    }
	public Book(String title, String type, double cost, int NumOfTokens, BookAuthor[] authors) {
		this.title = title;
		this.type = type;
		this.cost = cost;
        this.NumOfTokens = NumOfTokens;
        int n = authors.length;
        for (int i = 0; i < n; i++) 
            if (authors[i] != null) {
                this.authors[i] = authors[i];
                AuthorCount++;
            }
    }
	@Override
	public String toString() {
	 return "Book[" + this.id + "] - [" 
	 + this.title + "] - [" 
	 + this.cost + "] - [" 
	 + this.type + "] - ["
	 + this.NumOfTokens + "]"
	 + "\nAuthors: " + this.authors;
	}
}
