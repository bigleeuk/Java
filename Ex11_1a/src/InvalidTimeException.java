
public class InvalidTimeException extends Exception {

	private String hour;
	private String min;
	private String xx;
	static String time;
	public InvalidTimeException(){
		this.hour=getHour();
		this.min=getMin();
		this.xx=getXx();
	}
	public static boolean checktime(String t)throws InvalidTimeException {
		time="hour"+":"+"min"+":"+"xx";
		return time.equals(t);  
		
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public String getXx() {
		return xx;
	}
	public void setXx(String xx) {
		this.xx = xx;
	}
}
