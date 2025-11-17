package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsInCart[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added sucessfully");
    }
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
    	if (qtyOrdered + 1>= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
    	itemsInCart[qtyOrdered] = disc1;
    	qtyOrdered++;
    	itemsInCart[qtyOrdered] = disc2;
    	System.out.println("Two discs has been added sucessfully");
    }
    public void addDVD(DigitalVideoDisc ... discs) {
    	int n = discs.length;
    	if(n == 0) {
    		System.out.println("There is nothing to add");
    		return;
    	}
    	if (qtyOrdered + n - 1>= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
    	for(int i = 0;i < n;i++) {
    		itemsInCart[qtyOrdered] = discs[i];
        	qtyOrdered++;
    	}
    	System.out.println("The discs has been added sucessfully");
    }
    

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }

        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[qtyOrdered - 1] = null; 
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed sucessfully");
                break;
            }
        }

        if (!found) {
            System.out.println("The disc does not exist");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (DigitalVideoDisc item : itemsInCart) {
            if (item != null)
                totalCost += item.getCost();
        }
        return totalCost;
    }

    public void print() {
    	System.out.println("======================= THE CURRENT CART =======================");
    	if (qtyOrdered == 0) System.out.println("The cart is empty");
    	else {
            System.out.println("Total items: " + qtyOrdered);
            for (DigitalVideoDisc item : itemsInCart) {
            	if (item != null)
                    System.out.println("- " + item.toString());
            }
                
            System.out.println("Subtotal: " + calculateTotalCost() + "$");
        }
    			System.out.println("================================================================")	;	

    }
}