package com.example.model;

import java.util.List;

public interface DAOTrip {
	public List<Trip> getAllTrips();

	public void addTrip(Trip t);

	public void removeTrip(int id);
}