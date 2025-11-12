package ch06.sec10.exam02;

public class Television {
	static String compony = "Mycompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = compony +"-" + model;
	}
}
