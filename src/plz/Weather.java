package plz;


public class Weather {
    private Integer hour; // 시간
    private double temp; // 온도
    private String wfKor; // 날씨
    private int reh;// 누적 관객 수
    
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public String getWfKor() {
		return wfKor;
	}
	public void setWfKor(String wfKor) {
		this.wfKor = wfKor;
	}
	public int getReh() {
		return reh;
	}
	public void setReh(int reh) {
		this.reh = reh;
	}
	@Override
	public String toString() {
		return "Weather [hour=" + hour + ", temp=" + temp + ", wfKor=" + wfKor + ", reh=" + reh + "]";
	}
	
}
