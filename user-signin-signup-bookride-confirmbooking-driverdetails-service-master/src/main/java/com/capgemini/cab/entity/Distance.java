package com.capgemini.cab.entity;

public class Distance {
	private double lat1;
	private double long1;
	private double lat2;
	private double long2;
	private int finalDistance;

	public Distance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distance(double lat1, double long1, double lat2, double long2) {
		super();
		this.lat1 = lat1;
		this.long1 = long1;
		this.lat2 = lat2;
		this.long2 = long2;
		this.finalDistance=finalDistance;
	}

	public int getFinalDistance() {
		return finalDistance;
	}

	public void setFinalDistance(int finalDistance) {
		this.finalDistance = finalDistance;
	}

	public double getLat1() {
		return lat1;
	}

	public void setLat1(double lat1) {
		this.lat1 = lat1;
	}

	public double getLong1() {
		return long1;
	}

	public void setLong1(double long1) {
		this.long1 = long1;
	}

	public double getLat2() {
		return lat2;
	}

	public void setLat2(double lat2) {
		this.lat2 = lat2;
	}

	public double getLong2() {
		return long2;
	}

	public void setLong2(double long2) {
		this.long2 = long2;
	}

}
