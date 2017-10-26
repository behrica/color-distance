package org.ingram.color.space;



public abstract class ColorSpace {

	public abstract void fromXyz(XyzColorSpace xyz);
	public abstract XyzColorSpace toXyz();
	
	public void populateNewSpace(ColorSpace newSpace){
		newSpace.fromXyz(toXyz());
	}
	
}
