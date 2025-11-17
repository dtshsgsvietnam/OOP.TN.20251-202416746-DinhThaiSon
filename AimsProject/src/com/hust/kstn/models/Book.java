package com.hust.kstn.models;


	public class Book extends Media {
		private BookAuthor[] authors = new BookAuthor[10];
		private int AuthorCount = 0;
		private int NumOfTokens;
		public int getNumOfTokens() {
	        return NumOfTokens;
	    }
		public Book(String title, String type, double cost, int NumOfTokens, BookAuthor[] authors) {
			super( title, type, cost);
	        this.NumOfTokens = NumOfTokens;
	        int n = authors.length;
	        for (int i = 0; i < n; i++) 
	            if (authors[i] != null) {
	                this.authors[i] = authors[i];
	                AuthorCount++;
	            }
	    }
	@Override
	public String toString()  {
		 String result = super.toString() + " - " + "[" + this.NumOfTokens + "]";
		 for (int i = 0; i < AuthorCount; i++) 
	         result += "\nAuthor:" + this.authors[i].toString();
	     return result;
		}
}
