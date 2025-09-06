package com.project.catxi.map.dto;

public record CoordinateRes (
	Long roomId,
	String email,
	String name,
	String nickname,
	Double latitude,
	Double longitude,
	Double distance
){
}
