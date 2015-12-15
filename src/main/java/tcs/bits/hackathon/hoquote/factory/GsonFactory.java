package tcs.bits.hackathon.hoquote.factory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonFactory {

	public static Gson create() {
	    return new GsonBuilder().setPrettyPrinting().create();
	}
}
