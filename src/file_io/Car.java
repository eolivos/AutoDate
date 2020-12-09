package file_io;

import java.util.Date;

import org.json.JSONObject;

public class Car {
	private String id, owner;
	public String brand, model, motor, color, contact, observations;
	private Date inDate;
	
	public Car(String id, String owner, Date date) {
		this.id = id; this.owner = owner; inDate = date;
	}
	public Car(JSONObject car) {
		id = car.getString("id");
		owner = car.getString("owner");
		inDate = new Date(car.getLong("inDate"));
		
		if(car.has("brand")) brand = car.getString("brand");
		if(car.has("model")) model = car.getString("model");
		if(car.has("motor")) motor = car.getString("motor");
		if(car.has("color")) color = car.getString("color");
		if(car.has("contact")) contact = car.getString("contact");
		if(car.has("observations")) observations = car.getString("observations");
	}
	
	public String JSONString() {
		return getJSON().toString();
	}
	
	public JSONObject getJSON() {
		var data = new JSONObject();
		
		data.put("id", id);
		data.put("owner", owner);
		data.put("brand", brand);
		data.put("model", model);
		data.put("motor", motor);
		data.put("color", color);
		data.put("contact", contact);
		data.put("observations", observations);
		data.put("inDate", inDate.getTime());
		
		return data;
	}
	
	public String getId() {
		return id;
	}
	public Date getInDate() {
		return inDate;
	}
	public String getOwner() {
		return owner;
	}
}