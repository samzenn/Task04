public class Reflectionapi{
	
	public long x = 30;
	private long y = 40;
	public long z = 60;
	
	public Reflectionapi() {
	  }

	  

	public Reflectionapi(long x, long y) 
	{
	    this.x = x;
	    this.y = y;
	  }
	
//Square value of X
	public void squareX() 
	{
	    this.x *= this.x;
	  }

//Square value of Y
	private void squareY() 
	{
	    this.y *= this.y;
	  }

//Get X value
	public long getX() {
	    return x;
	  }

	  
//Set the value
	private void setA(long x) {
	    this.x = x;
	  }
	
//Get Y value
	public long getY() {
		    return y;
		  }

		  
//Set the value
	private void setY(long y) {
		    this.y = y;
		  }
	
	
	public String toString() 
	{
	    return String.format("(x:%d, y:%d)", x, y);
	  }

	
}