package org.ingram.color.entity;

import java.util.ArrayList;
import java.util.List;


public class ColorListEntity {

	private int id = 1;
	
	private String name = "";
	
	List<ColorEntity> colors = new ArrayList<ColorEntity>();
	
	
	public ColorListEntity(){
		
	}
	
	public ColorListEntity(String name){
		this.name = name;
	}
	
	public ColorListEntity(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void addColor(ColorEntity c){
		colors.add(c);
	}
	
	public void setColors(List<ColorEntity> colors){
		this.colors = colors;
	}
	
	public List<ColorEntity> getColors(){
		return colors;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
