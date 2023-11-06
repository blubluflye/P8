package com.openclassrooms.tourguide.dto;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import gpsUtil.location.Location;

@JsonPOJOBuilder
public record NearbyAttraction(
		String name,
		Location attractionPosition,
		Location userPosition,
		double distance,
		int reward) {}
