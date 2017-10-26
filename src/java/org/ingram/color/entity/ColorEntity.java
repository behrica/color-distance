package org.ingram.color.entity;

import java.util.regex.Pattern;


import org.ingram.color.web.ColorValidationException;

public class ColorEntity {

	private String name = null;
	
	private Integer id = null;
	
	private Double x = null;
	
	private Double y = null;
	
	private Double z = null;
	
	public ColorEntity(){
	}
	
	public ColorEntity(String name, double x, double y, double z){
		setName(name);
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public ColorEntity(ColorEntity e){
		this(e.getName(), e.getX(), e.getY(), e.getZ());
		setId(e.getId());
	}
	
	

	
	public String getName() {
		return name;
	}

	private static final String NAME_REGEX = "^[A-Za-z0-9 \\.]+$";
	
	public void setName(String name) {
		if(!Pattern.matches(NAME_REGEX, name)){
			throw new ColorValidationException("Color name " + name + " does not match regex string " + NAME_REGEX );
		}
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		this.z = z;
	}

	


}
