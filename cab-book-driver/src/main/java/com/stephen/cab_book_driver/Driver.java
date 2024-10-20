package com.stephen.cab_book_driver;



public class Driver {

	 private String driverId;
	    private String latitude;
	    private String longitude;
	    private String status;

	    public Driver() {}

	    public Driver(String driverId, String latitude, String longitude, String status) {
	        this.driverId = driverId;
	        this.latitude = latitude;
	        this.longitude = longitude;
	        this.status = status;
	    }

	    // Getters and setters
	    public String getDriverId() {
	        return driverId;
	    }

	    public void setDriverId(String driverId) {
	        this.driverId = driverId;
	    }

	    public String getLatitude() {
	        return latitude;
	    }

	    public void setLatitude(String latitude) {
	        this.latitude = latitude;
	    }

	    public String getLongitude() {
	        return longitude;
	    }

	    public void setLongitude(String longitude) {
	        this.longitude = longitude;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    @Override
	    public String toString() {
	        return "Driver{" +
	                "driverId='" + driverId + '\'' +
	                ", latitude='" + latitude + '\'' +
	                ", longitude='" + longitude + '\'' +
	                ", status='" + status + '\'' +
	                '}';
	    }}
