package com.capgemini.cab.entity;

public class BookRide {
	private String pickUpAt;
	private String dropAt;

	public BookRide() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookRide(String pickUpAt, String dropAt) {
		super();
		this.pickUpAt = pickUpAt;
		this.dropAt = dropAt;
	}

	public String getPickUpAt() {
		return pickUpAt;
	}

	public void setPickUpAt(String pickUpAt) {
		this.pickUpAt = pickUpAt;
	}

	public String getDropAt() {
		return dropAt;
	}

	public void setDropAt(String dropAt) {
		this.dropAt = dropAt;
	}

	@Override
	public String toString() {
		return "BookRide [pickUpAt=" + pickUpAt + ", dropAt=" + dropAt + "]";
	}

}
