package exam12;

class PointTwo /* extends Object */ {
	private int xPos, yPos;
	
	PointTwo(int x, int y){
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		String posInfo = "(x pos : " + xPos + ", y pos : " + yPos + ")";
		return posInfo;
	}
	
	
}
