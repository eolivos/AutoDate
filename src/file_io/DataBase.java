package file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;

import org.json.JSONObject;

public class DataBase {
	private HashMap<String, Car> data = new HashMap<>();
	private File file;
	
	public DataBase(String path) {
		try {
			file = new File("files/data/"+path);
			if(file.exists()) {
				var fData = new String(Files.readAllBytes(file.toPath()), "UTF-8").replaceAll("\r","").split("\n");
				for(var cData: fData) {
					if(!cData.trim().equals("")) {
						var car = new Car(new JSONObject(cData));
						data.put(car.getId(), car);
					}
				}
			} else {
				file.createNewFile();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean exists(String id) {
		return data.containsKey(id);
	}
	
	public boolean putCar(Car car) {
		var newCar = !exists(car.getId());
		
		data.put(car.getId(), car);
		
		return newCar;
	}
	
	public Car getCar(String id) {
		return data.get(id);
	}
	
	public void close(){
		FileWriter fWriter;
		try{
			fWriter = new FileWriter(file);
			var fData = "";
			for(var car: data.values()) {
				fData += car.JSONString() + "\n";
			}
			fWriter.write(fData);
			fWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
