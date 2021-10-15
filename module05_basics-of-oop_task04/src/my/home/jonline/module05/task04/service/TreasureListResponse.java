package my.home.jonline.module05.task04.service;

import java.util.ArrayList;
import java.util.List;

import my.home.jonline.module05.task04.bean.Treasure;

public class TreasureListResponse {
	private String message;
	private String response;

	List<Treasure> treasures;
	
	public TreasureListResponse() {
		treasures = new ArrayList<>();
		message = "";
		response = "";
	}
		
	public TreasureListResponse(String message, String response, List<Treasure> treasures) {
		this.message = message;
		this.response = response;
		this.treasures = treasures;
	}
	
	public String getMessage() {
		return message;
	}
	public String getResponse() {
		return response;
	}
	public List<Treasure> getTreasure() {
		return treasures;
	}
}
