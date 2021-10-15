package my.home.jonline.module05.task04.service;

import my.home.jonline.module05.task04.bean.Treasure;

/* 
 * Response codes:
 * "1" - no problems, no message
 * "0" - no problems, message must be added
 * "-1" - error, message must be added
 */
public class TreasureResponse {
	private String message;
	private String response;

	Treasure treasure;
	
	public TreasureResponse() {
		
	}
		
	public TreasureResponse(String message, String response, Treasure treasure) {
		this.message = message;
		this.response = response;
		this.treasure = treasure;
	}
	
	public String getMessage() {
		return message;
	}
	public String getResponse() {
		return response;
	}
	public Treasure getTreasure() {
		return treasure;
	}
	
	
}
